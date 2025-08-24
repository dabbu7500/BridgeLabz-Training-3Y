package string.level2;
import java.util.*;

public class CharacterType {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classify(String s) {
        int len = s.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = checkChar(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] arr = classify(input);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " -> " + arr[i][1]);
        }
    }
}
