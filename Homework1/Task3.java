package Homework1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {4, 4, 4, 4, 4};
        int[] arr2 = {2, 3, 2, 1};
        System.out.println(Arrays.toString(differenceArray(arr1, arr2)));
    }

    public static int[] differenceArray(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays are not equal");
        } else {
            int[] resultArray= new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                resultArray[i] = arr1[i] - arr2[i];
            }
            return resultArray;
        }
    }
}
