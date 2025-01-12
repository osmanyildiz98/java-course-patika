package calculate_circle_area_and_circum;
import java.util.Scanner;

public class CalculateCircleAreaCircum {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double r, pi = Math.PI;

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

        System.out.println("---------------------------------------------------------");
        System.out.println("The circumference of the circle is " + (int) Math.round(2 * pi * r));
        System.out.println("---------------------------------------------------------");
        System.out.println("The area of the circle is " + (int) Math.round(pi * r * r));
        System.out.println("---------------------------------------------------------");


    }
}
