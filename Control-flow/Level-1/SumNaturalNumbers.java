import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        // Formula method
        int formulaSum = n * (n + 1) / 2;

        // While loop method
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Formula result: " + formulaSum);
        System.out.println("While loop result: " + sum);
    }
}
