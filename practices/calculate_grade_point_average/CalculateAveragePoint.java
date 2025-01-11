package calculate_grade_point_average;
import java.util.Scanner;
public class CalculateAveragePoint {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your grade for the following subjects;");

        System.out.print("1. Mathematics grade: ");
        int mathematics = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("2. Physics grade: ");
        int physics = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("3. Chemistry grade: ");
        int chemistry = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("4. Biology grade: ");
        int biology = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("5. History grade: ");
        int history = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("6. English Literature grade: ");
        int englishLiterature = input.nextInt();
        System.out.println("------------------------------------------");

        int totalPoint = mathematics + physics + chemistry + biology + history + englishLiterature;
        int averagePoint = totalPoint / 6;

        System.out.println("Your average point is " + averagePoint + ". ");
        System.out.println("------------------------------------------");
        System.out.println(averagePoint > 60 ? "You passed." : "You Failed.");
        System.out.println("------------------------------------------");


    }
}