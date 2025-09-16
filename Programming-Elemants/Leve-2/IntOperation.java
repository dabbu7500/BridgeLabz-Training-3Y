import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

       
        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", and " + op3);
    }
}
