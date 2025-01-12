package calculate_sector_area_circle;
import java.util.Scanner;

public class calculateSectorAreaCircle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double r, a, pi = Math.PI;

        while (true) {
            System.out.print("Enter the radius: ");
            r = input.nextDouble();
            if(r <= 0) {
                System.out.println("---------------------------------------------------------");
                System.out.println("The radius cannot be zero or negative!");
                System.out.println("---------------------------------------------------------");

            }else {
                break;
            }
        }

        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.print("Please enter the central angle (in degrees) of the circle sector: ");
            a = input.nextDouble();
            if(a >= 0 && a <= 360) {
                break;
            }else {
                System.out.println("---------------------------------------------------------");
                System.out.println("The angle must be between 0 and 360 degrees!");
            }
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("The area of the circle is " + (int) Math.round((pi * r * r * a) / 360));
        System.out.println("---------------------------------------------------------");

    }
}
