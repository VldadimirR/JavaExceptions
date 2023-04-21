package Homework3.service;

import java.text.SimpleDateFormat;

import Homework3.exception.MyExceptionCheckString;
import Homework3.exception.MyExceptionDate;
import Homework3.exception.MyExceptionNumberPhone;
import Homework3.interfaces.ParsingData;

public class ParsingDataImpl implements ParsingData {

    @Override
    public String checkFIO(String line) {
        boolean result = true;
        char[] chars = line.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                result = false;
                break;
            }
        }
        if (result) {
            return line;
        } else {
            throw new MyExceptionCheckString();
        }
    }

    public String parsingSecondName(String[] data) {
        String secondName = data[0];
        return checkFIO(secondName);
    }

    public String parsingFirstName(String[] data) {
        String firstName = data[1];
        return checkFIO(firstName);
    }

    public String parsingMiddleName(String[] data) {
        String middleName = data[2];
        return checkFIO(middleName);
    }

    public String parsingDateOfBirth(String[] data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateOfBirth;
        try {
            dateOfBirth = data[3];
            dateFormat.parse(dateOfBirth.trim());
        } catch (Exception e) {
            throw new MyExceptionDate();
        }
        return dateOfBirth;
    }

    public Long parsingNumberPhone(String[] data) {
        try {
            String phone = data[4];
            if (phone.length() == 11) {
                return Long.parseLong(phone);
            } else {
                System.out.println("Неверная длина номера телефона или неверный формат номера");
            }
        } catch (Exception e) {
            throw new MyExceptionNumberPhone();
        }
        return null;
    }

    public Character parsingGender(String[] data) {
        String gender = data[5];
        if (gender.length() == 1 & gender.equals("f") || gender.equals("m")) {
            return gender.charAt(0);
        } else {
            System.out.println("Неверная длина для пола или не верный пол");
        }
        return null;
    }

}
