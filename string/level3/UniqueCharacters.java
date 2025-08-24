package string.level3;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacters {
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

    public static char[] findUnique(String s) {
        int len = getLength(s);
        char[] unique = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (unique[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) unique[index++] = c;
        }
        return Arrays.copyOf(unique, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] result = findUnique(input);
        System.out.println("Unique characters: " + Arrays.toString(result));
    }
}
