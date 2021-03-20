
public class JumpSearch {

    public int jumpSearch(int[] arr, int data) {

        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < data) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));

            if (prev >= n) {
                System.out.println("not found 1");
                return -1;
            }
        }

        while (arr[prev] < data) {
            prev++;

            if (prev == (int) Math.min(step, n)) {
                System.out.println("not found 2");
                return -1;
            }
        }

        if (arr[prev] == data) {
            return prev;
        }

        System.out.println("not found 3");
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 7, 9, 10, 11, 12, 15, 19, 21, 22 };

        JumpSearch jump = new JumpSearch();

        int index = jump.jumpSearch(arr, 22);

        System.out.println("the element is at " + (index + 1) + "th position");

    }

}
