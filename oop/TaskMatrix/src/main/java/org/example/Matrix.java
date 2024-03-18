package org.example;

public class Matrix {
    int[][] body;
    int row;
    int col;

    public Matrix(int[][] body, int row, int col){
        this.body = body;
        this.row = row;
        this.col = col;

    }

    public void setValue(int i, int j, int value){
        body[i - 1][j - 1] = value;
    }
    public static Matrix sumMatrix(Matrix a, Matrix b){
        if(a.row != b.row || a.col != b.col){
            System.out.println("Матрицы невозможно сложить: различный размер матриц!");
            System.exit(0);
        }
        int n = a.row;
        int m = a.col;
        int[][] sum = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum[i][j] = a.body[i][j] + b.body[i][j];
            }
        }
        return new Matrix(sum, n, m);
    }

    public Matrix alphaMatrix(int alpha){
        int n = row;
        int m = col;
        int[][] cmp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                cmp[i][j] = alpha*body[i][j];
            }
        }
        return new Matrix(cmp, n, m);
    }

    public void printMatrix(){
        int maxNum = -1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(maxNum  < body[i][j]){
                    maxNum = body[i][j];
                }
            }
        }
        int fixed = 0;
        while(maxNum !=- 0){
            maxNum /= 10;
            fixed++;
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.format("%3d ", body[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Matrix multMatrix(Matrix a, Matrix b){
        if(a.col != b.row){
            System.out.println("Матрицы невозможно перемножить: неподходящий размер матриц!");
            System.exit(0);
        }
        int n = a.row;
        int m = b.col;
        int[][] cmp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                cmp[i][j] = 0;
                for (int k = 0; k < b.row; k++) {
                    cmp[i][j] += a.body[i][k] * b.body[k][j];
                }
            }
        }
        return new Matrix(cmp, n, m);
    }
}
