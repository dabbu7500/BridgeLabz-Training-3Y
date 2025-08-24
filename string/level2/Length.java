package string.level2;

import java.util.*;

public class Length {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length1 = getLength(input);
        int length2 = input.length();
        System.out.println("Length (user method): " + length1);
        System.out.println("Length (built-in): " + length2);
        sc.close();
    }
}
