public class LinearSearch {

    int[] arr = { 1, 5, 9, 3, 7, 4, 8, 6, 2, 10 };

    public int search(int data) {
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                flag = i;
                break;
            } else {
                flag = 0;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        LinearSearch search = new LinearSearch();

        int position = search.search(7);

        if (position != 0) {
            System.out.println("The element is at " + (position + 1) + "th position");
        } else {
            System.out.println("Not found !!");
        }

    }

}