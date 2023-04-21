package Homework3.service;

import java.util.Scanner;

import Homework3.exception.MyExceptionMaxArguments;
import Homework3.exception.MyExceptionMinArguments;
import Homework3.interfaces.ReadingData;

public class ReadingDataImpl implements ReadingData {

    public String readData() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println(
                    "Введите данные через пробел: Фамилия, Имя, Отчество, дата рождения в формате dd.mm.yyyy, номер телефона, пол m или f");
            String line = scanner.nextLine();
            if (line == null || line.isEmpty()) {
                throw new IllegalArgumentException();
            } else {
                return line;
            }
        }
    }

    public String[] checkData() {
        String personData = readData();
        String[] data = personData.split(" ");
        if (data.length == 6) {
            return data;
        } else if (data.length < 6) {
            throw new MyExceptionMinArguments();
        } else {
            throw new MyExceptionMaxArguments();
        }
    }

}
