package com.amigoscode._3_oop._3_abstractclasses.learning;

public class Main {
    static void main() throws Exception {
        String path = "src/data.txt";
        new NumberExtractorReport().prepareAndSendReport(path);

        System.out.println();

        new EmailExtractorReport().prepareAndSendReport(path);
    }
}
