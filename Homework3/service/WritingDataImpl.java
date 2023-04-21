package Homework3.service;

import java.io.FileWriter;
import java.io.IOException;

import Homework3.dto.People;
import Homework3.interfaces.WritingData;

public class WritingDataImpl implements WritingData {

    public void writerData(People people, String name) {
        try (FileWriter fw = new FileWriter(name, true)){
            fw.write(people.getSecondName()+ " ");
            fw.write(people.getFirstName()+ " ");
            fw.write(people.getMiddleName() + " ");
            fw.write(people.getDateOfBirth()+ " ");
            fw.write(people.getNumberPhone()+ " ");
            fw.write(people.getGender()+ " ");
            fw.write("\n");
        }catch (IOException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            throw new NullPointerException();
        }
    }

}