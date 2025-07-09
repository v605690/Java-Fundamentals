package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int num;
        for (num = 2; num <= 100; num += 2) {
            System.out.println("Even number " + num);
        }
    }
}
