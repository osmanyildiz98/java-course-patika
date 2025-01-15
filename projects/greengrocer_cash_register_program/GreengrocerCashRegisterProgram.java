package greengrocer_cash_register_program;

import java.util.Scanner;

public class GreengrocerCashRegisterProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double pears = 2.14, apples = 3.67, tomatoes = 1.11, bananas = 0.95 , eggplants = 5.00;
        int pearsKg, applesKg, tomatoesKg, bananasKg, eggplantsKg;

        while(true) {
            System.out.print("How many kilograms of pears: ");
            pearsKg = input.nextInt();
            System.out.println("-------------------------------------------------------");

            if(pearsKg < 0){
                System.out.println("Please enter a valid weight.");
                System.out.println("-------------------------------------------------------");
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("How many kilograms of apples: ");
            applesKg = input.nextInt();
            System.out.println("-------------------------------------------------------");

            if(applesKg < 0){
                System.out.println("Please enter a valid weight.");
                System.out.println("-------------------------------------------------------");
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("How many kilograms of tomatoes: ");
            tomatoesKg = input.nextInt();
            System.out.println("-------------------------------------------------------");

            if(tomatoesKg < 0){
                System.out.println("Please enter a valid weight.");
                System.out.println("-------------------------------------------------------");
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("How many kilograms of bananas: ");
            bananasKg = input.nextInt();
            System.out.println("-------------------------------------------------------");

            if(bananasKg < 0){
                System.out.println("Please enter a valid weight.");
                System.out.println("-------------------------------------------------------");
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("How many kilograms of eggplants: ");
            eggplantsKg = input.nextInt();
            System.out.println("-------------------------------------------------------");

            if(eggplantsKg < 0){
                System.out.println("Please enter a valid weight.");
                System.out.println("-------------------------------------------------------");
            } else {
                break;
            }
        }

        double total = (pears * pearsKg)+(apples * applesKg)+(tomatoes * tomatoesKg)+(bananas * bananasKg)+(eggplants * eggplantsKg);

        System.out.println("Total amount is " + total);
        System.out.println("-------------------------------------------------------");

    }
}
