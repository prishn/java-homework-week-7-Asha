package javaprogrammeweek7;

import java.util.Scanner;

/**
 *Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 *  if any other alphabet should be invalid entry (This is programme 8 question)
 * 9.Same as above program-8 using switch statement.
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// created object for scanner
        System.out.println("Enter an Alphabet of city name from A to F: ");// printing the statement for user to enter the first letter of city name
        char firstLetter = sc.next().charAt(0);// storing the value in char which entered by user

        switchStatement(firstLetter); // calling the switch method to main method directly
        sc.close(); // closing the scanner
    }
    //creating new method using switch statement
    public static void switchStatement(char letter){

        switch (letter){
            case 'A': //in uppercase letter by user
            case 'a': // in lowercase letter by user
                System.out.println("Ayleshbury");
                break;
            case 'B'://in uppercase letter by user
            case 'b':// in lowercase letter by user
                System.out.println("Birmingham");
                break;
            case 'C'://in uppercase letter by user
            case 'c':// in lowercase letter by user
                System.out.println("Cranberry");
                break;
            case 'D'://in uppercase letter by user
            case 'd':// in lowercase letter by user
                System.out.println("Derby");
                break;
            case 'E'://in uppercase letter by user
            case 'e':// in lowercase letter by user
                System.out.println("Epsom");
            case 'F'://in uppercase letter by user
            case 'f':// in lowercase letter by user
                System.out.println("Farnborough");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
