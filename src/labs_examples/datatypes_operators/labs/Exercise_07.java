package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here
        int seconds = days * 24 * 60 * 60;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainder = minutes % 60;
        if (remainder == 0) {
            System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
        }
        scanner.close();
    }
}