package calculate_vat_amount;
import java.util.Scanner;

public class CalculateVatAmount {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an amount: ");
        double amount = input.nextDouble();
        System.out.println("------------------------------------------");

        if (amount < 0) {
            System.out.println("Amount must be positive, please try again!");
            System.out.println("------------------------------------------");
        } else {

            double vatRate = amount > 1000 ? 0.08 : 0.18;

            double vatAmount = amount * vatRate;

            double result = amount + vatAmount;

            System.out.println("The VAT rate is: " + (vatRate * 100) + "%");
            System.out.println("------------------------------------------");
            System.out.println("The VAT amount is: " + vatAmount);
            System.out.println("------------------------------------------");
            System.out.println("Total amount including VAT: " + result);
            System.out.println("------------------------------------------");
        }
    }
}
