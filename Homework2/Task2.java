package Homework2;

public class Task2 {
    public static void main(String[] args) {

        // Вариант 1 - заменить на if else
        int[] intArray = new int[] { 4, 2, 3, 4, 5, 6, 7, 8, 5 };
        int d = 0;
        if (d != 0) {
            double caughtRes1 = intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } else {
            System.out.println("Division error");
        }

        // Вариант 2 - добавить новые типы исключений
//        int[] intArray = new int[]{4,2,3,4,5,6,7,6,4,2};
//        try {
//            int d = 0;
//            double caughtRes1 = intArray[8] / d;
//            System.out.println("caughtRes1 = " + caughtRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Division by zero");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array out of bounds");
//        } catch (NullPointerException ex) {
//            System.out.println("A pointer cannot point to null");
//        }
    }
}
