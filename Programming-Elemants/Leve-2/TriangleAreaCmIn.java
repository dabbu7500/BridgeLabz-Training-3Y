import java.util.Scanner;

public class TriangleAreaCmIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54); 

        System.out.println("The area of the triangle in sq cm is " + areaCm2 + " and in sq in is " + areaIn2);
    }
}
