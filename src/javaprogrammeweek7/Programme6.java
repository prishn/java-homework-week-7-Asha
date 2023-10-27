package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 6.Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object creation for scanner
        System.out.println("Enter a number : "); // printing the statement for user to enter a number
        int number = sc.nextInt(); // storing the value into the integer which enter by user
        findOddEvenNumber(number); // calling static method to main method directly
        sc.close(); // closing the scanner
    }

    public static void findOddEvenNumber(int number) {
        // If user entered number is divisible by 2, then it is an even number else it is an odd number
        if (number % 2 == 0) // if condition
        {
            System.out.println(number + " is even number!"); // output is even
        } else // else if the output is odd
        {
            System.out.println(number + " is odd number!"); // output is odd
        }
    }
}
