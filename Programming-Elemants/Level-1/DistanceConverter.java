import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3.0;
        double miles = feet / 1760.0 / 3.0;  // 1 mile = 1760 yards, 1 yard = 3 feet

        System.out.println("The distance " + feet + " feet is " + yards + " yards and " + miles + " miles");
    }
}
