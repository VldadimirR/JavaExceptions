package Homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            try {
                System.out.print("Enter Float: ");
                System.out.println(inputFloat());
                check = false;
            } catch (RuntimeException r) {
                System.out.println(r.getMessage());
            }
        }
    }

    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        try {
            float inFloat = scanner.nextFloat();
            if (inFloat % 1 == 0) {
                throw new RuntimeException("Wrong type");
            } else {
                return inFloat;
            }
        } catch (InputMismatchException in) {
            scanner.next();
            throw new RuntimeException("Wrong type");

        }
    }
}
