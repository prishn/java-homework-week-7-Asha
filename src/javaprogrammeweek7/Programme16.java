package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 16.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating an object for scanner
        System.out.println("Enter the number: ");// print the statement for user to enter any number
        int number = sc.nextInt(); // storing that value into integer which entered by user
        findPosNegZeroNumber(number); // calling the other method to main main method directly
        sc.close(); // closing the scanner
    }
    //create the method for pos neg zero number with if else statement
    public static void findPosNegZeroNumber(int number){
        if(number >0){
            System.out.println(number + " is a Positive number");
        }else if (number < 0){
            System.out.println(number + " is a Negative number");
        }else {
            System.out.println(number + " is Zero");
        }
    }
}
