import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double cm = input.nextDouble();

        double inchesTotal = cm / 2.54;
        int feet = (int) (inchesTotal / 12);
        int inches = (int) (inchesTotal % 12);

        System.out.println("Your height in cm is " + cm + 
                           ", while in feet is " + feet + " and inches is " + inches);
    }
}
