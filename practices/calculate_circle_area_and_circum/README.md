# Calculate Circle Area and Circumference

<br>

This Java application calculates the area and circumference of a circle based on a user-inputted radius. The program ensures the input is valid (positive radius) and then outputs the calculated values for the circumference and area, rounded to the nearest integer.

<br>

## Features: 

<br>

- **Input Validation**: Ensures the radius is a positive number. Prompts the user for a valid input if the radius is zero or negative.

<br>

- **Circumference Calculation**: Calculates the circumference of the circle using the formula:

<br>

 > **$$\[C = 2 \times \pi \times r\]$$**

<br>

- **Area Calculation**: Calculates the area of the circle using the formula:

<br>

> **$$\[A = \pi \times r^2\]$$**

<br>

- **Output Rounding**: Results are rounded to the nearest integer using `Math.round()`.

<br>
  
  > ***Note: Where `r` is the radius.***

<br>

## How it Works: 

<br>

1. The program asks the user to input the radius of a circle.
2. If the radius is zero or negative, the program will display an error message and request the user to input a valid value.
3. After receiving a valid radius, the program calculates and displays the circumference and area of the circle.
4. The results are rounded to the nearest integer and printed on the screen.

<br>

## Example: 

<br>

**Input**:  

```
Enter the radius: 5
```

<br>

**Output**:

```
The circumference of the circle is 31  
The area of the circle is 79
```

<br>

## Requirements:

<br>

- **Java** (Version 8 or higher)

- A Java IDE or command line setup for running Java programs.

<br>

## How to Run:

<br>

1. Clone the repository to your local machine.
2. Compile and run the `CalculateCircleAreaCircum.java` file in your preferred Java development environment.

<br>

```
javac CalculateCircleAreaCircum.java
java CalculateCircleAreaCircum
```
