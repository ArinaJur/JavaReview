package collections;

public class Array {

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 2, 3, 4, 5};
        String[] arrayString = new String[]{"one", "two", "three", "four", "five"};
        double[]  arrayDouble = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};

//        for (int i = 0; i < arrayInt.length; i ++) {
//            System.out.println(arrayInt[i]);
//        }
//
//        for (int i = 0; i < arrayString.length; i ++) {
//            System.out.println(arrayString[i]);
//        }
//
//        for (int i = 0; i < arrayDouble.length; i ++) {
//            System.out.println(arrayDouble[i]);
//        }

        int[] arrayInt1 = new int[]{6, 7, 8, 9, 10};

        printArray(arrayInt);
        printArray(arrayString);
        printArray(arrayDouble);
        printArray(arrayInt1);
    }
}
