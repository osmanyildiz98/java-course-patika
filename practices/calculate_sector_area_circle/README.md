# Calculate Sector Area

<br>

This Java application calculates the area of a sector in a circle based on the radius and the central angle (in degrees) entered by the user. The program ensures valid input for both the radius and the angle, and then calculates the sector area using the appropriate formula.

<br>

## Features:

<br>

- **Input Validation for Radius**: The radius must be a positive number. If the user inputs zero or a negative number, the program prompts them to enter a valid value.
- **Input Validation for Angle**: The angle must be between 0 and 360 degrees. If the input is outside this range, the user is asked to provide a valid angle.
- **Sector Area Calculation**: The area of the sector is calculated using the formula:

<br>

$$\[A = \frac{{\pi \times r^2 \times \theta}}{{360}}\]$$

<br>

> ***where `r` is the radius and `θ` is the central angle in degrees.***

<br>

## How it Works:

<br>

> - The program first prompts the user to enter the radius of the circle.
> - If the entered radius is invalid (less than or equal to zero), the program will prompt the user to input a valid positive radius.
> - The user is then prompted to enter the central angle (in degrees) of the sector.
> - The program checks if the angle is between 0 and 360 degrees, ensuring it's a valid value.
> - The area of the sector is calculated and displayed as an integer rounded to the nearest value.

<br>

## Example:

<br>

**Input**:  

```
Enter the radius: 5  
Please enter the central angle (in degrees) of the circle sector: 90
```

**Output**:
