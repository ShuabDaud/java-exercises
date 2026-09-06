package com.amigoscode;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkingWithFiles {

    static void main() {
        // Files
        List<String> list = new ArrayList<>(7);
        list.add("Shuab Ahmed");
        list.add("Fatima Jama");
        list.add("Warsame Ali");
        list.add("Yusuf Dahir");
        list.add("Mohamed Magan");
        list.add("Maryama Abdullahi");
        list.add("Khayr Mohamud");


        File file = createFile("src/shuab.txt");
        fileWriter(file, list);
        fileReader(file);

    }
    private static void fileReader(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void fileWriter(File file, List<String> list) {

        try (FileWriter fileWriter = new FileWriter(file, false);
             PrintWriter printWriter = new PrintWriter(fileWriter, true)){

            for (int i = 0; i < list.size(); i++) {
                printWriter.println("[" + (i + 1) + "] => " + list.get(i)); //
            }
        } catch (IOException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }


}
