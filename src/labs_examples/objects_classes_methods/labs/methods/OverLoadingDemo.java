package labs_examples.objects_classes_methods.labs.methods;

public class OverLoadingDemo {
    public int adder(int a, int b) {return a + b; }
    public int adder(int a, int b, int c) { return a + b + c; }
    public int adder(double a, double b, double c) {return ((int)(a + b + c)); }
}
