package calculate_area_of_triangle;

import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main(String[] args) {
        int a, b, c;

        while (true) {
            a = getSideLength("Enter the length of the first side:");
            b = getSideLength("Enter the length of the second side:");
            c = getSideLength("Enter the length of the third side:");

            if(a+b>c) {
                if(a+c>b) {
                    if(b+c>a) {
                        break;
                    } else {
                        System.out.println("The given side lengths do not form a valid triangle. Please check the side lengths and try again."
                        );
                    }
                } else {
                    System.out.println("The given side lengths do not form a valid triangle. Please check the side lengths and try again."
                    );
                }
            } else {
                System.out.println("The given side lengths do not form a valid triangle. Please check the side lengths and try again."
                );
            }
        }

        int u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("The are of the triangle is " + area);

    }

    public static int getSideLength(String prompt) {
        Scanner input = new Scanner(System.in);
        int sideLength = 0;

        while (true) {
            System.out.print(prompt);
            String userInput = input.nextLine();

            try {
                sideLength = Integer.parseInt(userInput);
                if (sideLength <= 0) {
                    System.out.println("The side length must be a positive number. Please try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        return sideLength;
    }
}
