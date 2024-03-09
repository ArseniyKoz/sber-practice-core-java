package org.example;

public class TestMatrix {
    public static void main(String[] args){

        int n = 3;
        int m = 3;
        int[][] body1 = {{1, 3, 10}, {2, 4, 5}, {1, 1, 1}};
        int[][] body2 = {{-1, -3, -2}, {-2, -4, -5}, {-1, -1, -1}};
        Matrix a = new Matrix(body1, n, m);
        Matrix b = new Matrix(body2, n, m);

        System.out.println("A");
        a.printMatrix();
        System.out.println("B");
        b.printMatrix();

        System.out.println("A setValue");
        a.setValue(1, 3, 2);
        a.printMatrix();

        System.out.println("A + B");
        Matrix c = Matrix.sumMatrix(a, b);
        c.printMatrix();

        System.out.println("alpha*B");
        Matrix bAlpha = b.alphaMatrix(2);
        bAlpha.printMatrix();


        int n1 = 3;
        int m1 = 4;
        int[][] body3 = {{1, 3, 10, -5}, {2, 4, 5, 0}, {1, 1, 1, -1}};
        Matrix A = new Matrix(body3, n1, m1);

        int n2 = 4;
        int m2 = 4;
        int[][] body4 = {{0, 1, 1, 0}, {0, 4, 5, -4}, {0, 1, 1, 1}, {0, 3, -1, 2}};
        Matrix B = new Matrix(body4, n2, m2);

        System.out.println("A");
        A.printMatrix();
        System.out.println("B");
        B.printMatrix();

        System.out.println("A*B");
        Matrix C = Matrix.multMatrix(A, B);
        C.printMatrix();

    }
}
