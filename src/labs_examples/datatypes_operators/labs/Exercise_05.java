package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        boolean c = true;
        int y = 2;
        boolean shortCircuit = (c && (10 / y > 20));
        System.out.println(shortCircuit);

        boolean d = true;
        int x = 0;
        boolean longCircuit = (d || (10 / x > 0));
        System.out.println(longCircuit);

        boolean e = true;
        boolean f = false;
        boolean resultXOR = e ^ f;
        System.out.println(resultXOR);

        boolean isHot = true;
        if (!isHot) {
            System.out.println("isHot is false");
        }
        boolean metaVision = true;
        boolean visionPro = false;

        String glasses = String.valueOf(metaVision & visionPro);
        System.out.println(glasses);
    }
}

