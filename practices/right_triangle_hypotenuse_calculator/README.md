# Right Triangle Hypotenuse Calculator in Java

This Java application calculates the length of the hypotenuse of a right triangle using the Pythagorean theorem. The user is prompted to input the lengths of the two perpendicular sides (also known as the legs) of the triangle. The program then computes the hypotenuse and displays the result.

## Step 1: User Input
The first step in the application is to gather the lengths of the two sides of the right triangle. The user is prompted to input two values: the length of side `a` and the length of side `b`. These values are read from the console using a `Scanner` object.

### Valid Input:
The program expects positive numeric values for both sides. If the user inputs a value that is zero or negative, the program will inform the user that the side lengths must be positive numbers and will ask them to try again.

## Step 2: Hypotenuse Calculation
Once the valid inputs are entered, the program calculates the length of the hypotenuse using the Pythagorean theorem:

\[
\text{Hypotenuse} = \sqrt{a^2 + b^2}
\]

Where:
- `a` is the length of one perpendicular side,
- `b` is the length of the other perpendicular side.

The result is displayed to the user as the calculated length of the hypotenuse.

## Step 3: Displaying the Result
Once the calculation is complete, the program prints the length of the hypotenuse to the console.

### Example Usage:
Here’s an example of how the program works:

**Input:**

Enter the first side length: 3 Enter the second side length: 4

**Output:**

The length of the hypotenuse: 5.0

## Requirements:
- Java (Version 8 or higher)
- A Java IDE or command line setup for running Java programs.

## How to Run:
1. Clone the repository to your local machine.
2. Compile and run the `CalculateHypotenuse.java` file in your preferred Java development environment.

**Commands:**

```bash
javac CalculateHypotenuse.java
java CalculateHypotenuse
