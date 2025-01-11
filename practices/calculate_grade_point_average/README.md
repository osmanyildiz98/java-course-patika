# Grade Point Average Calculation in Java<br>

This Java application calculates the grade point average (GPA) based on user input. The program prompts the user to enter their grades for six different subjects, computes the total grade points, calculates the average, and then displays whether the user has passed or failed.<br>

## Step 1: User Input<br>

The first step in the application is to gather the grades for six subjects: Mathematics, Physics, Chemistry, Biology, History, and English Literature. The program prompts the user to enter their grades one by one. If a valid grade is entered, it moves on to the next subject.<br>

The user is prompted for the following grades:<br>

- **Mathematics**<br>
- **Physics**<br>
- **Chemistry**<br>
- **Biology**<br>
- **History**<br>
- **English Literature**<br>

For each subject, after entering the grade, the user sees a separator line to make the input process clearer.<br>

## Step 2: Calculating the Total and Average Points<br>

Once all the grades are entered, the application calculates the total grade points by summing up the individual grades. Then, the average grade point is calculated by dividing the total points by 6 (the number of subjects).<br>

The formula for calculating the GPA is:<br>

$$
\text{Total Points} = \text{Mathematics} + \text{Physics} + \text{Chemistry} + \text{Biology} + \text{History} + \text{English Literature}
$$<br>

Then the average is calculated as:<br>

$$
\text{Average GPA} = \frac{\text{Total Points}}{6}
$$<br>

## Step 3: Displaying the Result<br>

Once the average GPA is calculated, the program displays the result to the user. If the average GPA is greater than 60, the user is informed that they have passed; otherwise, the program will indicate that they have failed.<br>

The result will be displayed in one of two ways:<br>

- If average GPA > 60, the message displayed will be: "
