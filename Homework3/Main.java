package Homework3;

import Homework3.interfaces.ParsingData;
import Homework3.interfaces.ReadingData;
import Homework3.interfaces.WritingData;
import Homework3.service.ParsingDataImpl;
import Homework3.service.ReadingDataImpl;
import Homework3.service.WritingDataImpl;

public class Main {
    public static void main(String[] args) {
        ReadingData readingData = new ReadingDataImpl();
        ParsingData parsingData = new ParsingDataImpl();
        WritingData recordingData = new WritingDataImpl();
        Terminal terminal = new Terminal(readingData, parsingData, recordingData);

        terminal.run();

    }
}
