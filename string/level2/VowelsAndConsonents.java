package string.level2;
import java.util.*;

public class VowelsAndConsonents {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String res = checkChar(s.charAt(i));
            if (res.equals("Vowel")) vowels++;
            else if (res.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
