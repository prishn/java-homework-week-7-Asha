package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 8.Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 * used the if else statement
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// creating object for scanner
        System.out.println("Enter an Alphabet of city name from A to F: "); //Printing statement for user to enter the alphabet in uppercase
        char firstLetter = sc.next().charAt(0); // storing the value into the char which entered by user
        cityName(firstLetter); // calling the cityName method in to the main method
        sc.close();// closing the scanner
    }

    // creating new method for cityName to find out from A to F
    public static void cityName(char a) {
        if (a == 'A' || a == 'a') { // using or operator so user can enter either upper case or lowercase
            System.out.println("Ayleshbury");
        } else if (a == 'B' || a == 'b') {// using or operator so user can enter either upper case or lowercase
            System.out.println("Birmingham");
        } else if (a == 'C' || a == 'c') {// using or operator so user can enter either upper case or lowercase
            System.out.println("Cambridge");
        } else if (a == 'D' || a == 'd') {// using or operator so user can enter either upper case or lowercase
            System.out.println("Derby");
        } else if (a == 'E' || a == 'e') {// using or operator so user can enter either upper case or lowercase
            System.out.println("Epsom");
        } else if (a == 'F' || a == 'f') {// using or operator so user can enter either upper case or lowercase
            System.out.println("Farnborough");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
