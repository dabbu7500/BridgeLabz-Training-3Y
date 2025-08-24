import java.util.Scanner;

public class ToLowerCaseDemo {
    static String toLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); 
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

        String manual = toLower(str);
        String builtin = str.toLowerCase();

        System.out.println("Manual Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Are both equal? " + manual.equals(builtin));
        sc.close();
    }
}
