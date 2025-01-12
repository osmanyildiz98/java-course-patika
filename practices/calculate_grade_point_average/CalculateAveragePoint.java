package calculate_grade_point_average;
import java.util.Scanner;

public class CalculateAveragePoint {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your grade for the following subjects:");

        int mathematics = getGrade("Mathematics");
        int physics = getGrade("Physics");
        int chemistry = getGrade("Chemistry");
        int biology = getGrade("Biology");
        int history = getGrade("History");
        int englishLiterature = getGrade("English Literature");

        int totalPoint = mathematics + physics + chemistry + biology + history + englishLiterature;
        int averagePoint = totalPoint / 6;

        System.out.println("Your average point is " + averagePoint + ".");
        System.out.println(averagePoint >= 60 ? "You passed." : "You Failed.");
    }

    public static int getGrade(String subject) {
        Scanner input = new Scanner(System.in);
        int grade;

        while (true) {
            System.out.print("Enter grade for " + subject + ": ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                input.next();
            }
            grade = input.nextInt();
            if (grade >= 0 && grade <= 100) {
                break;
            } else {
                System.out.println("Please enter a grade between 0 and 100.");
            }
        }
        return grade;
    }
}
