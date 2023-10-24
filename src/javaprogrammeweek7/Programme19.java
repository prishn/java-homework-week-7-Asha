package javaprogrammeweek7;

import java.util.Arrays;

/**
 * 19.Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void main(String[] args) {
        // Numerical array declaration
        int[] numArray = {50, 60, 80, 30, 20, 90, 140, 250};
        int sum = 0;
        //calculating the sum of the arrays value
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }// finding the average of arrays value
        int avg = sum / numArray.length;
        //Printing the original value of an arrays
        System.out.println("The original value of arrays elements are: " + Arrays.toString(numArray));
        //total of average values of an array
        System.out.println("The average of all the arrays value are: " + avg);
    }
}
