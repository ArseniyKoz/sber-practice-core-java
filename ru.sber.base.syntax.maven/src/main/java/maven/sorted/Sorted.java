package maven.sorted;

public class Sorted {

    public static int[] bubleSort(int[] x) {
        for(int i = 0; i < x.length - 1; ++i) {
            for(int j = 0; j < x.length - 1 - i; ++j) {
                if (x[j] > x[j + 1]) {
                    int cmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = cmp;
                }
            }
        }

        return x;
    }

    public static long[] bubleSort(long[] x) {
        for(int i = 0; i < x.length - 1; ++i) {
            for(int j = 0; j < x.length - 1 - i; ++j) {
                if (x[j] > x[j + 1]) {
                    long cmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = cmp;
                }
            }
        }

        return x;
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = this.partition(arr, begin, end);
            this.quickSort(arr, begin, partitionIndex - 1);
            this.quickSort(arr, partitionIndex + 1, end);
        }

    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        int j;
        for(j = begin; j < end; ++j) {
            if (arr[j] <= pivot) {
                ++i;
                int cmp = arr[i];
                arr[i] = arr[j];
                arr[j] = cmp;
            }
        }

        j = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = j;
        ++i;
        return i;
    }

    public void quickSort(long[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = this.partition(arr, begin, end);
            this.quickSort(arr, begin, partitionIndex - 1);
            this.quickSort(arr, partitionIndex + 1, end);
        }

    }

    private int partition(long[] arr, int begin, int end) {
        long pivot = arr[end];
        int i = begin - 1;

        for(int j = begin; j < end; ++j) {
            if (arr[j] <= pivot) {
                ++i;
                long cmp = arr[i];
                arr[i] = arr[j];
                arr[j] = cmp;
            }
        }

        long cmp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = cmp;
        ++i;
        return i;
    }
}
