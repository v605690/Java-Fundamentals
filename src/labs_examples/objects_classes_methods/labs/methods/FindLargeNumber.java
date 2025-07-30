package labs_examples.objects_classes_methods.labs.methods;

public class FindLargeNumber {
    static int[] numArray = {12, 15, 23, 3};

    public static int findLargeNum(int n, int n2, int n3) {
        int largeNum = numArray[0];

        for (n = 1; n < numArray.length; n++) {
            if (numArray[n] > largeNum) {
                largeNum = numArray[n];
            }
        }
        return largeNum;
    }

    public static void main(String[] args) {
        int x = findLargeNum(0, 0, 0);

        System.out.println(x);
    }
}
