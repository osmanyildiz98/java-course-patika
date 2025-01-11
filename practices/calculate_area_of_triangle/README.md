# Triangle Area Calculation in Java

This Java application allows you to calculate the area of a triangle by inputting the lengths of its three sides. The process involves validating the triangle’s side lengths, ensuring they form a valid triangle, and then calculating the area using **Heron’s formula**.

## Step 1: User Input Validation

The first step in the application is to gather the three side lengths of the triangle. This is done using the `getSideLength` function, which ensures that the user enters valid numerical values for each side. If the input is not a valid number (e.g., letters or symbols), the function will display an error message and prompt the user to enter a valid number.

## Step 2: Validating the Triangle

Once the side lengths are provided, the application checks if they form a valid triangle. A triangle is valid if the sum of any two sides is greater than the third side. This is verified using the following mathematical inequalities:

- \( a + b > c \)
- \( a + c > b \)
- \( b + c > a \)

If any of these conditions are not met, the application will notify the user that the given sides do not form a valid triangle and ask for new input.

## Step 3: Calculating the Area

If the triangle is valid, the area is then calculated using **Heron's formula**:

$$
\textcolor{red}{\text{Area} = \sqrt{s(s - a)(s - b)(s - c)}}
$$

where \( \textcolor{red}{s} \) is the semi-perimeter, calculated as:

$$
\textcolor{red}{s = \frac{a + b + c}{2}}
$$

The result is then displayed to the user as the area of the triangle.

## Step 4: Displaying the Result

Once the area is successfully calculated, it is displayed to the user with a message indicating the area of the triangle.

---

## Example Usage:

Here is an example of how the program works:

1. **Input**: Enter the lengths of the triangle sides:
    - Side 1: 5
    - Side 2: 6
    - Side 3: 7

2. **Output**:
    - The area of the triangle is `14.7`.

---

## Requirements:

- **Java** (Version 8 or higher)
- A Java IDE or command line setup for running Java programs.

---

## How to Run:

1. Clone the repository to your local machine.
2. Compile and run the `CalculateAreaOfTriangle.java` file in your preferred Java development environment.

```bash
javac CalculateAreaOfTriangle.java
java CalculateAreaOfTriangle
