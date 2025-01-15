# Taximeter Program in Java

<br>

This Java application calculates the fare of a taxi ride based on the distance traveled. The user is prompted to input the distance in kilometers, and the program then computes the fare according to a fixed rate per kilometer and a minimum fare.

<br>

## Step 1: User Input

<br>

The first step in the application is to gather the distance traveled by the user. The user is prompted to input the distance in kilometers. This value is read from the console using a `Scanner` object.

<br>

### Valid Input:

<br>

The program expects a positive numeric value for the distance. If the user inputs a value that is zero or negative, the program will inform the user that the distance must be a positive number and ask them to try again.

<br>

## Step 2: Fare Calculation

<br>

Once the valid distance input is entered, the program calculates the fare using the following formula:

<br>

$$
\text{Fare} = \text{Minimum Fare} + (\text{Distance} \times \text{Rate per Kilometer})
$$

<br>

Where:<br>
- **Minimum Fare** is set to 10 units
- **Rate per Kilometer** is set to 2.20 units

If the calculated fare is less than 20 units, the program will adjust the fare to 20 units.

<br>

The result is displayed to the user as the total fare to be paid.

<br>

## Step 3: Displaying the Result

<br>

Once the calculation is complete, the program prints the calculated fare to the console. If the fare is below the minimum threshold, the program will display the adjusted fare of 20 units.

<br>

### Example Usage:

<br>

Here’s an example of how the program works:

<br>

**Input:**

Please enter the distance in kilometers: 5

<br>

**Output:**

The amount you need to pay is 20.0

<br>

## Requirements:

<br>

- Java (Version 8 or higher)
- A Java IDE or command line setup for running Java programs.

## How to Run:

<br>

1. Clone the repository to your local machine.
2. Compile and run the `TaximeterProgram.java` file in your preferred Java development environment.

**Commands:**

<br>

```
javac TaximeterProgram.java
java TaximeterProgram
```
