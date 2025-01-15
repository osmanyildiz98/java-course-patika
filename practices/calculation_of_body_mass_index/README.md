# Calculation of Body Mass Index (BMI)

<br>

This Java application calculates the Body Mass Index (BMI) based on the user's weight and height. The program validates the user's inputs to ensure they are valid values and then calculates and displays the BMI using the appropriate formula.

<br>

## Features:

<br>

- **Input Validation for Weight**: The program ensures that the entered weight is a positive number. If a non-positive number is entered, the user is prompted to enter a valid weight.
<br>
- **Input Validation for Height**: The program checks that the entered height is positive. If an invalid height is entered, the user is asked to input a valid height.
<br>
- **BMI Calculation**: The Body Mass Index is calculated using the formula:
<br>

**$$\[BMI = \frac{{\text{weight}}}{{\text{height}^2}}\]$$**

<br>

> Note: where `weight` is the user's weight in kilograms and `height` is the user's height in meters.

<br>

## How it Works:

<br>

1. The program prompts the user to enter their weight in kilograms.
<br>
2. If the entered weight is less than or equal to zero, the program asks the user to provide a valid weight.
<br>
3. The program then prompts the user to input their height in meters.
<br>
4. If the entered height is invalid (less than or equal to zero), the program requests a valid height.
<br>
5. After receiving valid inputs for both weight and height, the program calculates and displays the BMI.

<br>

## Example:

<br>

**Input**:

<br>

`Please enter your weight: 70`  
`Please enter your height (in meters): 1.75`

<br>

**Output**:

<br>

`Your body mass index is 22.857142857142858`

<br>

## Technologies Used:

<br>

- Java (JDK 8 or later)
- `Scanner` for reading user input from the console

<br>

## How to Run:

<br>

1. Clone this repository to your local machine.
2. Compile and run the `CalculationOfBodyMassIndex.java` file in your Java IDE or from the command line.
3. Follow the on-screen instructions to input your weight and height, then see your calculated BMI.
