package labs_examples.fundamentals.labs;


import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int i = str.length();
        System.out.println("str length is " + i);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean b1 = str.equals(str2);
        System.out.println("b1 is " + b1);
        // please concatenate str & str2 and set the result to a new String variable below
        String newString = str + " " + str2;
        System.out.println("New string is " + newString);
        System.out.println(str.concat(str2));
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println(str.contains("hel"));
        System.out.println(str.length());
        System.out.println(str2.replace("hello", "Greetings"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is " + sum);

    }


}