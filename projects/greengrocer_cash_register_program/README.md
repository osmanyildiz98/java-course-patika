# Greengrocer Cash Register Program

<br>

This Java application simulates a greengrocer's cash register, where users can input the weight of various fruits and vegetables they wish to purchase. The program calculates the total cost based on predefined prices per kilogram.

## Features:

<br>

- **Input Validation**: The program ensures the entered weights are valid (non-negative). If a negative weight is entered, the user is prompted to enter a valid weight.
- **Price Calculation**: The program calculates the total price for the selected fruits and vegetables by multiplying the weight of each item by its price per kilogram.
- **Items**: The program supports five items: pears, apples, tomatoes, bananas, and eggplants, with predefined prices per kilogram.

<br>

## How it Works:

<br>

1. The program prompts the user to enter the weight in kilograms for each item: pears, apples, tomatoes, bananas, and eggplants.
2. If the entered weight is negative, the program will ask the user to enter a valid (positive) weight.
3. After all items have been entered, the program calculates the total cost by multiplying the weight of each item by its price per kilogram and adding them together.
4. The total cost is then displayed to the user.

## Example:

<br>

**Input**:

`How many kilograms of pears: 3`  
`How many kilograms of apples: 2`  
`How many kilograms of tomatoes: 1`  
`How many kilograms of bananas: 4`  
`How many kilograms of eggplants: 1`

<br>

**Output**:

`Total amount is 27.49`

<br>

## Technologies Used:
- Java (JDK 8 or later)
- `Scanner` for reading user input from the console

<br>

## How to Run:
1. Clone this repository to your local machine.
2. Compile and run the `GreengrocerCashRegisterProgram.java` file in your Java IDE or from the command line.
3. Follow the on-screen instructions to input the weight for each item and see the total cost.


