package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Take in a number from user and print day of the week: ");

        int dayNum = scanner.nextInt();

        String dayName;

        if (dayNum == 1) {
            System.out.println(dayName = "Monday");
        } else if (dayNum == 2) {
            System.out.println(dayName = "Tuesday");
        } else if (dayNum == 3) {
            System.out.println(dayName = "Wednesday");
        } else if (dayNum == 4) {
            System.out.println(dayName = "Thursday");
        } else if (dayNum == 5) {
            System.out.println(dayName = "Friday");
        } else if (dayNum == 6) {
            System.out.println(dayName = "Saturday");
        } else {
            System.out.println(dayName = "Sunday");
        }
    }
}
