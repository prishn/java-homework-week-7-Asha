package javaprogrammeweek7;

/**
 * 6.Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {
    public static void main(String[] args) {
        int num = 2; // assign the value to variable
        if (num % 2 == 0) // if condition
        {
            System.out.println("The number is even!"); // output is even
        } else // else if the output is odd
        {
            System.out.println("The number is odd!"); // output is odd
        }
    }
}
