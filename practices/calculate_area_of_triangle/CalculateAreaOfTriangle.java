package calculate_area_of_triangle;

import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side:");
        int a = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("Enter the length of the second side:");
        int b = input.nextInt();
        System.out.println("------------------------------------------");

        System.out.print("Enter the length of the third side:");
        int c = input.nextInt();
        System.out.println("------------------------------------------");

        int u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("The are of the triangle is " + area);

    }
}
