package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

public class Programme10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);// creating object for scanner
        System.out.println("Enter a first number: "); // printing statement for user to enter the first number
        double num1 = sc1.nextDouble();// storing the value in double data type which enter by user
        System.out.println("Enter second number: ");// printing statement for user to enter the second number
        double num2 = sc1.nextDouble();//storing the value in double data type which enter by user
        System.out.println("Enter any symbol from this (+, -, *, /): "); // printing statement for user to enter the operator symbol
        char operator = sc1.next().charAt(0);//storing the value in char data type which enter by user
        sc1.close();// closed scanner
        // calculating the method as per selection by user
        double result;
        if (operator == '+') {
            // Addition
            result = num1 + num2;
            System.out.println("Results: " + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            //subtraction
            result = num1 - num2;
            System.out.println("Results: " + num1 + " - " + num2 + " =  " + result);
        } else if (operator == '*') {
            // Multiplication
            result = num1 * num2;
            System.out.println("Results: " + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            // Division
            result = num1 / num2;
            System.out.println("Results: " + num1 + " / " + num2 + " = " + result);
        } else {
            // invalid input
            System.out.println("Invalid operator");
        }
    }
}
