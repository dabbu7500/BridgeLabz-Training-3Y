import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = sc.nextDouble();

        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516; // 1 square inch = 6.4516 sq cm

        System.out.println("The area of triangle is " + areaSqInches + " square inches and " + areaSqCm + " square cm");
    }
}
