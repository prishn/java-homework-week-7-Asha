package javaprogrammeweek7;

/**
 * 11.Write a java program to print the numbers between 1 and 100
 * which can be divided by 3 and 5 separately.
 */
public class Programme11 {
    public static void main(String[] args) {
        dividedByThree();// calling the divided by three method into the main method
        dividedByFive(); // calling the divided by five method into the main method
    }
    //creating method for divided by three between 1 and 100
    public static void dividedByThree(){
        System.out.println("Numbers divided by 3 between 1 to 100: ");
        for (int i =1; i <=100; i++){ // use for loop for condition
            if (i % 3 == 0)
                System.out.println(i+ " ");
        }
    }
    // creating method for divided five between 1 and 100
    public static void dividedByFive(){
        System.out.println("Numbers divided by 5 between 1 to 100: ");
        for (int i =1; i<=100; i++){ // use for loop for condition
            if (i % 5 == 0)
                System.out.println(i+ " ");
        }
    }
}
