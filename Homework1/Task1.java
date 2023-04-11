package Homework1;

public class Task1 {
    public static void main(String[] args) {
        ArrayIndexOut(); //ArrayIndexOutOfВoundsException
        System.out.println(division(23,0)); //ArithmeticException
        method(); // ClassCastException

    }

    public static void ArrayIndexOut(){
        int[] arr = new int[10];
        System.out.println(arr[255]);
    }

    public static int division(int a, int b){
        return  a/b;
    }

    public static void method(){
        Object primitives = new int[1];
        long[] longs = (long[]) primitives;
    }

}