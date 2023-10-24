package javaprogrammeweek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating the object for scanner
        System.out.println("Enter the Student's Name: "); // printing a statement for user to enter the student name
        String studentName = sc.nextLine(); // storing the value in string which entered by user
        System.out.println("Enter a Roll Number: ");//printing a statement for user to enter the roll number
        int rollNumber = sc.nextInt();//storing the value in string which entered by user
        System.out.println("Enter a marks for Maths:   ");//printing a statement for user to enter the maths
        double maths = sc.nextDouble();//storing the value in string which entered by user
        System.out.println("Enter a  marks for Science: "); //printing a statement for user to enter the science
        double science = sc.nextDouble();//storing the value in string which entered by user
        System.out.println("Enter a marks for English: "); //printing a statement for user to enter the english
        double english = sc.nextDouble();//storing the value in string which entered by user
        // if the entered marks in between 1 to 100 for each subjects it is condition
        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
        }
        // calculate percentage and result
        double totalMarks = maths + science + english;
        double percentage = (totalMarks / 300) * 100;

        // display result
        System.out.println("Percentage" + percentage);
        String result = (percentage >= 35 && maths >= 35 && science >= 35 && english >= 35) ? "Pass" : "Fail"; // ternary operator
        // grade calculation
        String grade = " ";
        if (percentage <= 100 && percentage >= 80) {
            grade = "A+";
        } else if (percentage <= 80 && percentage >= 60) {
            grade = "A";
        } else if (percentage <= 60 && percentage >= 50) {
            grade = "B";
        } else if (percentage <= 50 && percentage >= 35) {
            grade = "C";
        }
        sc.close();// closing scanner

        // printing a marksheet

        System.out.println("|-----------------------------------------------|");
        System.out.println("|            MARK SHEET                         |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Name           :  " + studentName + "       |");
        System.out.println("|   Roll Number    :  " + rollNumber + "        |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Subjects       :           Marks            |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Maths          :       " + maths + "        |");
        System.out.println("|   Science        :      " + science + "       |");
        System.out.println("|   English        :      " + english + "       |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|    Total         :     " + totalMarks + "     |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   Percentage     :    " + percentage + "      |");
        System.out.println("|   Result         :     " + result + "         |");
        System.out.println("|   Grade          :      " + grade + "         |");
        System.out.println("|-----------------------------------------------|");
    }
}