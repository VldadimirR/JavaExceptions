package Homework3.exception;

public class MyExceptionMinArguments extends RuntimeException {

    public MyExceptionMinArguments() {
        super("Вы ввели недостаточно данных");
    }
}
