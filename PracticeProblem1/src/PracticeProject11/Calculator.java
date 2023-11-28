package PracticeProject11;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter the first number: ");
        double num1 = s.nextDouble();

        // Input: Operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        // Input: Second number
        System.out.print("Enter the second number: ");
        double num2 = s.nextDouble();

        // Perform the arithmetic operation based on the operator
        double result = 0.0;
        switch (operator) {
            case '+':
            	// Calculation for Addition
                result = num1 + num2;
                break;
            case '-':
            	// Calculation for Substraction
                result = num1 - num2;
                break;
            case '*':
            	//Check for Multiply
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        s.close();

	}

}
