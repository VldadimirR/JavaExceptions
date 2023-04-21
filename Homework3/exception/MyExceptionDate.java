package Homework3.exception;

public class MyExceptionDate extends RuntimeException {

    public MyExceptionDate() {
        super("Неверный формат даты, нужно ввести дату в формате dd.mm.yyyy");
    }
}
