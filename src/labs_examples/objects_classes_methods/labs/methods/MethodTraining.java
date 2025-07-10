package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {

    public int add(int num1) {
        return add(num1, 3);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public void produce(String text) {
        System.out.println("Produce " + text);
    }

    public void produce(String text, int copies) {
        System.out.println("Printed out " + text +  " with " +  copies + " copies");
    }

    public static void passByValue(int num) {
        num = 40;
        System.out.println("Original Value " + num);
    }

    public static void main(String[] args) {
        MethodTraining methodTraining = new MethodTraining();

        int num = 50;

        int result = methodTraining.add(4, 8);
        int resul2 = methodTraining.add(5, 1, 8);
        int result3 = methodTraining.add(3);

        System.out.println(result);
        System.out.println(resul2);
        System.out.println(result3);

        System.out.println();

        MethodTraining mt = new MethodTraining();
       mt.produce("report.pdf", 5);
       mt.produce("image.jpg");

       passByValue(num);
        System.out.println("Changed Value " + num);
        
    }
}

class PassByReferenceDemo {
   String message;

    public PassByReferenceDemo(String message) {
        this.message = message;
    }

    public static void passByRef(PassByReferenceDemo pass) {
        pass.message = "New Message";
        System.out.println("Inside method call: " + pass.message);
    }

    public static void main(String[] args) {
        PassByReferenceDemo obj = new PassByReferenceDemo("Original Message");
        System.out.println("Before method call: " + obj.message);
        passByRef(obj);
        System.out.println("After method call: " + obj.message);
    }
}
