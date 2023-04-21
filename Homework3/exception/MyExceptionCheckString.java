package Homework3.exception;

public class MyExceptionCheckString extends RuntimeException {

    public MyExceptionCheckString() {
        super("Ошибка при вводе ФИО");
    }
}
