public class bubbleSort {
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 2, 5, 4, 3, 1 };

        System.out.println("Array : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        bubbleSort bSort = new bubbleSort();
        int[] sortedArr = bSort.sort(arr);

        System.out.println("Sorted array : ");

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }
}
