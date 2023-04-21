package Homework3;

import java.util.Arrays;

import Homework3.dto.People;
import Homework3.exception.MyExceptionCheckString;
import Homework3.exception.MyExceptionDate;
import Homework3.exception.MyExceptionMaxArguments;
import Homework3.exception.MyExceptionMinArguments;
import Homework3.exception.MyExceptionNumberPhone;
import Homework3.interfaces.ParsingData;
import Homework3.interfaces.ReadingData;
import Homework3.interfaces.WritingData;

public class Terminal {
    private final ReadingData readingData;
    private final ParsingData parsingData;
    private final WritingData recordingData;

    public Terminal(ReadingData readingData, ParsingData parsingData, WritingData recordingData) {
        this.readingData = readingData;
        this.parsingData = parsingData;
        this.recordingData = recordingData;
    }

    public People createPeople() {
        String[] personData = new String[10];
        try {
            personData = readingData.checkData();
        } catch (IllegalArgumentException exc) {
            System.out.println("Пустые строки не могут быть введены" + Arrays.toString(exc.getStackTrace()));
        } catch (MyExceptionMinArguments | MyExceptionMaxArguments e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка при чтении");

        }
        try {
            String firstName = parsingData.parsingFirstName(personData);
            String secondName = parsingData.parsingSecondName(personData);
            String middleName = parsingData.parsingMiddleName(personData);
            String dateOfBirth = parsingData.parsingDateOfBirth(personData);
            Long numberPhone = parsingData.parsingNumberPhone(personData);
            char gender = parsingData.parsingGender(personData);
            return new People(secondName, firstName, middleName, dateOfBirth, numberPhone, gender);
        } catch (MyExceptionDate | MyExceptionCheckString | MyExceptionNumberPhone e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Пустые аргументы");
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка");
        }
        return null;
    }

    public void run() {
        try {
            People people = createPeople();
            String pathName = "src/Exception/Lesson3/Zad3/Homework3/" + people.getSecondName();
            recordingData.writerData(people, pathName);
        } catch (Exception e) {
            System.out.println("Ошибка при записи" + Arrays.toString(e.getStackTrace()));
        }

    }
}


