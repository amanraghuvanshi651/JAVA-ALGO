public class mergeSort {

    public void merge(int[] arr, int l, int mid, int h) {

        // find arr size
        int n1 = mid - l + 1;
        int n2 = h - mid;

        // create the arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr, int l, int h) {

        if (l < h) {

            int mid = (l + h) / 2;

            sort(arr, l, mid);

            sort(arr, mid + 1, h);

            merge(arr, l, mid, h);

        }

    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = { 12, 2, 4, 5, 7, 8, 9, 1, 6, 3, 10, 11 };

        System.out.println("Array : ");
        printArray(arr);

        mergeSort mSort = new mergeSort();

        int n = arr.length - 1;
        mSort.sort(arr, 0, n);

        System.out.println("Sorted Array : ");
        printArray(arr);

    }

}
