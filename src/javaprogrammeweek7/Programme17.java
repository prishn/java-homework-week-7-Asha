package javaprogrammeweek7;

import java.util.Arrays;

/**
 * 17.Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        intArray();// calling intArray method into main method directly
        stringArray();// calling stringArray method into main method directly
    }

    // creating method for numeric array
    public static void intArray() {
        //declaring numeric arrays and initialization of numeric array
        int[] array1 = {-50, -200, -70, 50, 100, 10, 70, 150, 30};
        // it converts arrays to string
        System.out.println("The Original integer array is: " + Arrays.toString(array1));
        Arrays.sort(array1);// sorting out int arrays
        System.out.println("The sorted integer array is: " + Arrays.toString(array1));
    }

    //creating method for string array
    public static void stringArray() {
        //declaring string arrays and initialization of string array
        String[] array2 = {"Python", "Java", "Ruby", "C++", "C", "Go", "Android", "iphone", "Testing"};
        // it converts arrays to string
        System.out.println("The Original string array is: " + Arrays.toString(array2));
        Arrays.sort(array2);// sorting out string arrays
        System.out.println("The sorted string array is: " + Arrays.toString(array2));
    }
}
