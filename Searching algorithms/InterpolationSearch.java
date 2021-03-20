public class InterpolationSearch {

    public int interpolationSearch(int arr[], int start, int end, int data) {

        if (start <= end && data >= arr[start] && data <= arr[end]) {
            int pos = start + (((end - start) / (arr[end] - arr[start])) * (data - arr[start]));
            System.out.println(pos);
            if (arr[pos] == data) {
                return pos;
            }

            if (arr[pos] < data) {
                return interpolationSearch(arr, pos + 1, end, data);
            }

            if (arr[pos] > data) {
                return interpolationSearch(arr, start, pos - 1, data);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 6, 7, 10, 11, 14, 15 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        int data = 4;

        InterpolationSearch interpolationSearch = new InterpolationSearch();

        int index = interpolationSearch.interpolationSearch(arr, start, end, data);

        if (index != -1) {
            System.out.println("element is at  postion : " + (index + 1));
        } else {
            System.out.println("Not found!!");
        }

    }

}
