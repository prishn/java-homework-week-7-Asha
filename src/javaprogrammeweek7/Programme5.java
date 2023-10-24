package javaprogrammeweek7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating an object for scanner
        System.out.println("Enter an Employee ID: "); // printing the statement for user so user can enter the emp ID
        int empID = sc.nextInt(); // storing emp ID in integer which entered by user
        System.out.println("Enter an Employee Name: "); // printing the statement for user to enter emp Name
        String name = sc.next(); // storing the emp name in String which enter by user
        System.out.println("Enter a Basic salary: "); // printing the statement for user to enter the basic salary
        double basicSalary = sc.nextDouble(); // storing the value for salary in to double which enter by user
        sc.close();// closing scanner
        // creating the variables for HRA, TA, DA, PF and Gross salary in double data type
        double HRA = 0.10 * basicSalary;
        double TA = 0.08 * basicSalary;
        double DA = 0.09 * basicSalary;
        double PF = 0.20 * basicSalary;
        double GrossSalary = basicSalary + HRA + TA + DA - PF;
        // Now printing the salary slip in below format:
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|                   Salary Slip                         |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|  Employee ID          : " + empID + "|");
        System.out.println("|  Employee Name        : " + name + "|");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|  Basic Salary         : " + basicSalary + "|");
        System.out.println("|  HRA 10 %             : " + HRA + "|");
        System.out.println("|  TA 8 %               : " + TA + "|");
        System.out.println("|  DA 9 %               : " + DA + "|");
        System.out.println("|  PF 20 %              : " + PF + "|");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|  Gross Salary         : " + GrossSalary + "|");
        System.out.println("|=======================================================|");
    }
}
