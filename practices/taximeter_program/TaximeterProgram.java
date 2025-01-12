package taximeter_program;
import java.util.Scanner;

public class TaximeterProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double kmRate = 2.20;
        int minimumFare = 10;

        System.out.print("Please enter the distance in kilometers: ");
        double distance = input.nextDouble();
        System.out.println("---------------------------------------");

        double result = minimumFare + (distance * kmRate);

        System.out.println("The amount you need to pay is " + (result < 20 ? 20 : result));

        input.close();
    }
}
