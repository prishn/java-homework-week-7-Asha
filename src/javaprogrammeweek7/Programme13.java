package javaprogrammeweek7;

import java.util.Scanner;

/**
 *13.Write a Java program which input any number between 1 and 7, and
 * it prints The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 **/
public class Programme13 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);// creating an object for scanner
        System.out.println("Enter a number between 1 to 7: "); // print the statement for user to enter the number
        int day = sc1.nextInt(); // storing the value into the integer which is entered by user
        daysName(day);// calling the daysName method in main method
        sc1.close();// closing scanner
    }
    // creating method for daysName with switch statement condition
    public static void daysName(int day){
        switch (day) {
            case 1:
                System.out.println("It is a Monday");
                break;
            case 2:
                System.out.println("It is a Tuesday");
                break;
            case 3:
                System.out.println("It is a Wednesday");
                break;
            case 4 :
                System.out.println("It is a Thursday");
                break;
            case 5:
                System.out.println("It is a Friday");
                break;
            case 6:
                System.out.println("It is a Saturday");
                break;
            case 7:
                System.out.println("It is a Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
