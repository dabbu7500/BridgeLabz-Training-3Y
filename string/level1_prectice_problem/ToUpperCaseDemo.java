import java.util.Scanner;

public class ToUpperCaseDemo {
    static String toUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // ASCII conversion
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String manual = toUpper(str);
        String builtin = str.toUpperCase();

        System.out.println("Manual Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtin);
        System.out.println("Are both equal? " + manual.equals(builtin));
        sc.close();
    }
}
