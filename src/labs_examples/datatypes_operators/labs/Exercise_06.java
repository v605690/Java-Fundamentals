package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        Double radius = 3.14;
        int height = 5;

        double area = radius * radius * radius * height;
        double volume = area * radius * radius * height;

        System.out.println("Area is " + area);
        System.out.println("Volume is " + volume);

    }
}