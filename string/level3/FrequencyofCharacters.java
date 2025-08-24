package string.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyofCharacters {
     public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) list.add(new String[]{String.valueOf((char)i), String.valueOf(freq[i])});
        }
        return list.toArray(new String[0][0]);
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
