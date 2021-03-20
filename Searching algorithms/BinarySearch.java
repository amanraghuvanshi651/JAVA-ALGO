public class BinarySearch {

    public int search(int arr[], int l, int r, int data) {

        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == data) {
                return mid;
            }
            if (data < arr[mid]) {
                return search(arr, l, mid - 1, data);
            }
            if (data > arr[mid]) {
                return search(arr, mid + 1, arr.length - 1, data);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int n = arr.length - 1;
        BinarySearch search = new BinarySearch();
        int position = search.search(arr, 0, n, 13);

        if (position != -1) {
            System.out.println("element is at " + (position + 1) + "th position");
        } else {
            System.out.println("Not Found !!");
        }
    }

}
