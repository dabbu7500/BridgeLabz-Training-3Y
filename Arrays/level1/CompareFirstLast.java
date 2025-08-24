package Arrays.level1;

import java.util.Scanner;

public class CompareFirstLast {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Check each number
        for (int num : arr) {
            if (num > 0) {
                System.out.print(num + " is Positive and ");
                if (num % 2 == 0) System.out.println("Even");
                else System.out.println("Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[4]) System.out.println("First and last are equal");
        else if (arr[0] > arr[4]) System.out.println("First is greater than last");
        else System.out.println("Last is greater than first");
    }
}
