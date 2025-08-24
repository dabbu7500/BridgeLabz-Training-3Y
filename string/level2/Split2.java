package string.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Split2 {
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
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] wordLengths = getWordLengths(words);
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + " - " + Integer.parseInt(wordLengths[i][1]));
        }
        sc.close();
    }

}
