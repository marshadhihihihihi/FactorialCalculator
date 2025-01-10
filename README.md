# Factorial Calculator in Java

This project contains a Java program to calculate the factorial of a given number. It prompts the user for input, computes the factorial, and allows the user to repeat the process or terminate the program.

## How It Works

1. The program uses a "Scanner" to read input from the user.
2. It calculates the factorial of the number using a loop in the `factorial` method.
3. After showing the result, the program gives the user the option to continue or exit.

## Features

- Calculates factorials for numbers greater than or equal to 0.
- User-friendly loop for repeated inputs.
- Graceful termination with a thank-you message.

## Code Structure

- `factorial(int num)`: A static method that calculates the factorial of a number.
- `main(String... args)`: Contains the main logic for user interaction and program execution.

## How to Run

1. Compile the program:

   javac FactorialOfaNumber.java

2.Run the program :
  
   java FactorialOfaNumber

3.Example : 

   Enter a number to see factorial of that number : 5
   Factorial of this number is : 120

   If you want to re-enter a number type (y) Or to terminate this program type (n) : y
   Enter a number to see factorial of that number : 3
   Factorial of this number is : 6

   If you want to re-enter a number type (y) Or to terminate this program type (n) : n
   Thank you for using our service!
