package string.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortestAndLongestWord {

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

    public static String[][] getWordLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }

    public static String[] getShortestAndLongest(String[][] arr) {
        String shortest = arr[0][0], longest = arr[0][0];
        int min = Integer.parseInt(arr[0][1]), max = Integer.parseInt(arr[0][1]);
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) {
                min = len;
                shortest = arr[i][0];
            }
            if (len > max) {
                max = len;
                longest = arr[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] arr = getWordLengths(words);
        String[] result = getShortestAndLongest(arr);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }

}
