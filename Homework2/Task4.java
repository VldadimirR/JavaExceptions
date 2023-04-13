package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println(inputEmptyLine());
        } catch (IllegalArgumentException exc) {
            System.out.println("Empty lines cannot be entered.");
        }
    }

    public static String inputEmptyLine() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line == null || line.isEmpty()) {
            throw new IllegalArgumentException("Empty line");
        } else {
            return line;
        }
    }
}
