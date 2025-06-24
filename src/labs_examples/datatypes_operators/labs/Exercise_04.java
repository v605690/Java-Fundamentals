package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int c = 4;
        int d = 8;
        if (c < d){
            System.out.println("c is less than d");
        } else if (c == d){
            System.out.println("c is not equal to d");
        }  else if (c > d){
            System.out.println("c is greater than d");
        } else if (c <= d) {
            System.out.println("c is less equal to d");
        } else if (d >= c)  {
            System.out.println("d is greater than c");
        }  else {
            System.out.println("d is not equal to c");
        }
    }

}

