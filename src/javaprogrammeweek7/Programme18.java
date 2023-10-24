package javaprogrammeweek7;

import java.util.Arrays;

/**
 * 18.	Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        //numeric array declaration
        int[] number = {2590, 5680, 4287, 1022, 2008, 2011, 3000, 4500, 6450};
        int sum = 0;
        //calculating the sum of arrays value
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }// Printing the original value of an arrays
        System.out.println("Values of an array elements ara: " + Arrays.toString(number));
        // total of sum values of an array
        System.out.println("Sum of arrays elements are: " + sum);
    }
}
