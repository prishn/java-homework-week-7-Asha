package javaprogrammeweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);// object creation for scanner
        System.out.println("Enter Sales ID: "); // printing the statement so user can enter sales ID
        int salesID = sc1.nextInt(); // storing the value for sales ID in integer which is entered by user
        System.out.println("Enter Seller's name: ");// printing th statement so user can enter the seller's name
        String name = sc1.next();// storing the value in string which entered by user
        System.out.println("Enter sales amount: "); // printing the statement so user can enter sales amount
        double salesAmount = sc1.nextDouble();// storing the value in double which entered by user
        System.out.println("Enter the basic salary : "); // printing the statement so user can enter the basic salary
        double salaryBasic = sc1.nextDouble();// storing the basic salary in double which entered by user

        double commission = commissionCalculation(salesAmount); // calling the static method to main method directly
        System.out.println("Commission: " + commission); //printing the statement for commission
        sc1.close();// closing scanner
    }

    // creating new method to calculate the commission
    public static double commissionCalculation(double salesAmount) {
        double commission = 0;// conditions
        if (salesAmount >= 50000) {
            commission = (double) 35 / 100 * salesAmount;
        } else if (salesAmount >= 30000) { // (salesAmount >=30000 && salesAmount <= 50000)
            commission = (double) 20 / 100 * salesAmount;
        } else if (salesAmount >= 20000) { // (salesAmount >=20000 && salesAmount <= 30000)
            commission = (double) 10 / 100 * salesAmount;
        } else if (salesAmount >= 10000) { // (salesAmount >=10000 && salesAmount <= 20000)
            commission = (double) 5 / 100 * salesAmount;
        } else if (salesAmount <= 10000) { // (salesAmount >=0 && salesAmount <= 10000)
            commission = (double) 2 / 100 * salesAmount;
        } else {
            System.out.println("No commission");
        }
        return commission; // return statement
    }
}
