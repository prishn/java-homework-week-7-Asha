package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 12.Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating object for scanner
        System.out.println("Enter a character: ");// printing the statement so user can add any characters
        char ch = sc.next().charAt(0);// storing the value in char which is entered by user
        checkingCharacter(ch); // calling the checkingCharacter in main methods
        sc.close();// closing scanner
    }
    // creating the new method to check the character with if else condition
    public static void checkingCharacter(char ch){
        if(Character.isLetter(ch)){
            System.out.println("This character is an alphabet");
        }else if(Character.isDigit(ch)){
            System.out.println("This character is a Digit");
        } else{
            System.out.println("This character is Symbol");
        }
    }
}
