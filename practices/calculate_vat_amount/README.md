# VAT Amount Calculation in Java<br>

This Java application calculates the Value Added Tax (VAT) based on a given amount. The program prompts the user to enter an amount, determines the appropriate VAT rate, calculates the VAT amount, and then computes the total amount including VAT.<br>

## Step 1: User Input<br>

The first step in the application is to gather an amount from the user. The user is prompted to enter a numerical value representing the price of a product or service.<br>

- **Amount**: The user is asked to enter an amount for which the VAT will be calculated.<br>

If the amount entered is negative, the program will ask the user to input a valid positive amount.<br>

## Step 2: Determining the VAT Rate<br>

The program then checks whether the entered amount exceeds a certain threshold (1000). If the amount is greater than 1000, a VAT rate of 8% is applied; otherwise, a VAT rate of 18% is used.<br>

- **VAT Rate**: 
    - 8% if the amount is greater than 1000<br>
    - 18% if the amount is less than or equal to 1000<br>

## Step 3: Calculating the VAT and Total Amount<br>

Once the VAT rate is determined, the VAT amount is calculated as follows:<br>

$$
\text{VAT Amount} = \text{Amount} \times \text{VAT Rate}
$$<br>

Then, the total amount including VAT is calculated:<br>

$$
\text{Total Amount} = \text{Amount} + \text{VAT Amount}
$$<br>

The results are then displayed to the user:<br>
- **VAT Rate** (percentage)
- **VAT Amount** (calculated VAT)
- **Total Amount including VAT** (final price including VAT)<br>

## Step 4: Displaying the Result<br>

Once the VAT and total amount are calculated, the program displays the following details to the user:<br>

- The VAT rate applied<br>
- The VAT amount<br>
- The total amount including VAT<br>

---

## Example Usage:<br>

Here is an example of how the program works:<br>

1. **Input**: Enter an amount for VAT calculation:<br>
    - Amount: 1500<br>

2. **Output**:<br>
    - The VAT rate is: `8%`<br>
    - The VAT amount is: `120.0`<br>
    - Total amount including VAT: `1620.0`<br>

---

## Requirements:<br>

- **Java** (Version 8 or higher)<br>
- A Java IDE or command line setup for running Java programs.<br>

---

## How to Run:<br>

1. Clone the repository to your local machine.<br>
2. Compile and run the `CalculateVatAmount.java` file in your preferred Java development environment.<br>

```bash
javac CalculateVatAmount.java<br>
java CalculateVatAmount<br>
