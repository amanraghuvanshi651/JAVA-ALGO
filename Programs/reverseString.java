public class reverseString {

    public void reverse(String str) {
        System.out.println("The String is : " + str);
        char[] arr = str.toCharArray();

        System.out.println("The reverse String is : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        reverseString rev = new reverseString();

        rev.reverse("My name is Aman Raghuvanshi");

    }

}