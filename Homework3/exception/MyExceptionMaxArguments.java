package Homework3.exception;

public class MyExceptionMaxArguments extends RuntimeException {

    public MyExceptionMaxArguments() {
        super("Вы ввели слишком много данных");
    }
}
