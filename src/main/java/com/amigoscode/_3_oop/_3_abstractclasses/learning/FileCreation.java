package com.amigoscode._3_oop._3_abstractclasses.learning;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreation {
    static void main() {
        Path path = Path.of("src/data.txt");

        String content = """
                # This file contains all kinds of data
                Amigoscode
                Jamila
                Josh
                07848486464
                HELLO@amigoscode.com
                Bar
                Bianca
                02054545112
                SUPPORT@AMIGOSCODE.com
                Shuabdaud@just.edu.so
                617122322
                """;

        try {
            Files.writeString(path, content);
            String data = Files.readString(path);
            System.out.println(data);
            System.out.println("Success");
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
