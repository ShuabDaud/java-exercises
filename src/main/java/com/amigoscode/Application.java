package com.amigoscode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    enum Gender {
        MALE,
        FEMALE;

        enum Color {
            BLUE,
            GREEN,
            RED;

            enum Months {
                JANUARY,
                FEBRUARY,
                MARCH
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Amigoscode Java Exercises");
        System.out.println("Navigate to each package and run the exercises individually.");

    }

}
