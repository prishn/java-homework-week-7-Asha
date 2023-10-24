package javaprogrammeweek7;

/**
 * 20.	Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        //numerical array declaration
        int[] num = {500, 950, 750, 600, 900, 200, 400};
        boolean contains;// calling contains method into main method
        System.out.println("Array does not contains value: " + contains(num, 1000));
        System.out.println("Array contains the value: " + contains(num, 750));
        //System.out.println(contains(num, 1000));
        //System.out.println(contains(num, 900));
    }

    public static boolean contains(int[] arrays, int items) {
        boolean contain = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == items) {
                contain = true;
                break;
            }
        }
        return contain;
    }
}