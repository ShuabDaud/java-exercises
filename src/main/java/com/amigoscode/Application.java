package com.amigoscode;

public class Application {

    public static void main(String[] args) {
//        System.out.println("Amigoscode Java Exercises");
//        System.out.println("Navigate to each package and run the exercises individually.");

        System.out.println();

        try {
            int n = Integer.parseInt("1x");
            System.out.println(n);
            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("getClass(): " + e.getClass());
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(: " + e.getLocalizedMessage());
            System.out.println("fillInStackTrace(): " + e.fillInStackTrace());
            System.out.println("getStackTrace(): " + e.getStackTrace());
            System.out.println("getSuppressed(): " + e.getSuppressed());

        }

    }


}
