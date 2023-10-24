package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 1.Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1 {
    public static void main(String[] args) {
        /*int num = 3;
        String msg = (num % 2 == 0) ? "The number is even!": "The number is odd!";
        System.out.println(msg);*/
        Scanner sc = new Scanner(System.in); // object creation for scanner
        System.out.println("Enter a number: ");// print the statement so user can enter the number
        int num = sc.nextInt();// store the number into the integer
        String msg = (num % 2 == 0) ? "even" : "odd"; //use the ternary method to find the even or odd number
        System.out.println(num + " is " + msg + " number."); //Print the statement for output accordingly
        sc.close();// closed the scanner
    }
}
