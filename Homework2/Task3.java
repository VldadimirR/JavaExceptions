package Homework2;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Task3 {

    // Поменял местами исключения
    // Заменил Throwable на Exception
    // Добавил новые типы исключений
    // Обработал исключение из printSum

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2, 2, 5 };
            abc[3] = 9;
            System.out.println(Arrays.toString(abc));
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка вычислений");
        } catch (FileNotFoundException ex) {
            System.out.println("Не удалось открыть файл");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
