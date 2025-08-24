package string.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Split {
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

    public static String[] splitWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int len = getLength(s);
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c != ' ') word.append(c);
            else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    public static boolean compareStrings(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] userSplit = splitWords(input);
        String[] builtInSplit = input.split(" ");
        boolean equal = compareStrings(userSplit, builtInSplit);
        System.out.println("Equal? " + equal);
        System.out.println("User method: " + Arrays.toString(userSplit));
        System.out.println("Built-in method: " + Arrays.toString(builtInSplit));
    }
}
