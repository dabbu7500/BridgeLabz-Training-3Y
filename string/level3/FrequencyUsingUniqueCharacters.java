package string.level3;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
     public static char[] uniqueChars(String s) {
        char[] temp = new char[s.length()];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < idx; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[idx++] = c;
        }
        return Arrays.copyOf(temp, idx);
    }

    public static String[][] frequency(String s) {
        char[] unique = uniqueChars(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == unique[i]) count++;
            }
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] result = frequency(input);
        for (String[] row : result) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}
