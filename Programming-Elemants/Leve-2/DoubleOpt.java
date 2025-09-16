import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

       
        double op1 = a + b * c;
        double op2 = c + a / b;
        double op3 = a % b + c;

        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", and " + op3);
    }
}
