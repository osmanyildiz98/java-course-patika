import java.util.Scanner;
public class CalculateAveragePoint {
    public static void main (String[] args) {
        int mathematics, physics, chemistry, biology, history, englishLiterature;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your grade for the following subjects:");

        System.out.print("1. Mathematics grade: ");
        mathematics = input.nextInt();

        System.out.print("2. Physics grade: ");
        physics = input.nextInt();

        System.out.print("3. Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("4. Biology grade: ");
        biology = input.nextInt();

        System.out.print("5. History grade: ");
        history = input.nextInt();

        System.out.print("6. English Literature grade: ");
        englishLiterature = input.nextInt();

        int totalPoint = mathematics + physics + chemistry + biology + history + englishLiterature;
        int averagePoint = totalPoint / 6;

        System.out.print("Your average point is " + averagePoint + ". ");
        System.out.println(averagePoint > 60 ? "You passed." : "You Failed.");


    }
}