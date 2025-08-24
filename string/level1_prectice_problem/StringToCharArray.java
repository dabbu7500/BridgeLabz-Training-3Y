import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {
    static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] arr1 = getChars(str);
        char[] arr2 = str.toCharArray();

        System.out.println("User-defined char array: " + Arrays.toString(arr1));
        System.out.println("Built-in char array: " + Arrays.toString(arr2));
        System.out.println("Are both equal? " + Arrays.equals(arr1, arr2));
        sc.close();
    }
}
