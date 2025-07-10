package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int result = multiply(5, 5);
        System.out.println(result);
        int result2 = divide(5, 5);
        System.out.println(result2);
        myJoke();

        System.out.println("Length " + getVarargsLength("Milk", "Bananas", "Blueberries"));

    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {

        return (a * b);
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void myJoke() {
        System.out.println("Uh...lemme think...... Lemme think.. Java doesn't have garbage collection, because if it did, it would delete itself.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

//    public static int numSeconds(int years) {
//        return
//    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int getVarargsLength(String...stuff) {

        return stuff.length;
    }
}
