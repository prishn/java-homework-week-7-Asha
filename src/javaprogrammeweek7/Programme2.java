package javaprogrammeweek7;

import java.util.Scanner;

/**
 * 2.Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);// object creation for scanner
        System.out.println("Enter a year: "); // print the statement so user can enter the year
        int year = sc1.nextInt();// storing the value which user put into the integer
        isLeapYear(year); // calling isLeapYear method into the main method -->static to static direct
        sc1.close();// closed the scanner
    }

    //Leap year are those years with 366 days instead of 365. A leap year must satisfy
    // any one of the following two conditions:
    //Leap year = (It should be divisible by 4) or (not by 100) && (it should be divisible by 400)
    //A century year should be divisible by 4 and 100 both
    // Non-century year should not be divisible only by 4
    public static void isLeapYear(int year) {
        //if (year % 400 == 0)
        if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0)
        {
            System.out.println(year + " The year is leap year!");
        } else {
            System.out.println(year + " The year is not leap year!");
        }
    }
}
