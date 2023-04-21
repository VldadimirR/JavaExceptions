package Homework3.interfaces;

public interface ParsingData {

    String checkFIO(String line);

    String parsingSecondName(String[] data);

    String parsingFirstName(String[] data);

    String parsingMiddleName(String[] data);

    String parsingDateOfBirth(String[] data);

    Long parsingNumberPhone(String[] data);

    Character parsingGender(String[] data);
}
