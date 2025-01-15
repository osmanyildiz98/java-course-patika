package calculation_of_body_mass_index;

import java.util.Scanner;

public class CalculationOfBodyMassIndex {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int weight;
        double height;

        while(true) {
            System.out.print("Please enter your weight: ");
            weight = input.nextInt();
            System.out.println("--------------------------------------------------------------------------------------------");

            if (weight <= 0) {
                System.out.println("The weight you entered is invalid. Please enter a valid weight in kilograms (e.g., 70).");
                System.out.println("--------------------------------------------------------------------------------------------");
            } else {
                break;
            }
        }

            while (true) {
                System.out.print("Please enter your height (in meters): ");
                height = input.nextDouble();
                System.out.println("--------------------------------------------------------------------------------------------");

                if (height <=0) {
                    System.out.println("The height you entered is invalid. Please enter a valid height in meters (e.g., 1.75).");
                    System.out.println("--------------------------------------------------------------------------------------------");
                } else {
                    break;
                }
            }

            System.out.println("Your body mass index is " + weight / height * height);
    }
}
