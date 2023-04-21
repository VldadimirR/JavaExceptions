package Homework3.exception;

public class MyExceptionNumberPhone extends RuntimeException {

    public MyExceptionNumberPhone() {
        super("Неверный формат номера телефона");
    }
}
