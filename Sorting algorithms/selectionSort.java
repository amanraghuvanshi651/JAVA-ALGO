public class selectionSort {

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }
            System.out.println(min_idx + " : " + arr[min_idx]);
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 10, 8, 5, 3, 1 };

        System.out.println("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        selectionSort s = new selectionSort();
        int[] sortedArr = s.sort(arr);

        System.out.println("Sorted array is : ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }

    }

}