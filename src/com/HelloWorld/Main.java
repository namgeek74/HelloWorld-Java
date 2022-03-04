package com.HelloWorld;

import java.util.Scanner;  // Import the Scanner class
import java.time.LocalDate; // import the LocalDate class

public class Main {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
    }

    static boolean isValid(String s) {
        int prevLen = s.length();
        while (s.length() > 0) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
            if (s.length() < prevLen) {
                prevLen = s.length();
            } else {
                return false;
            }
        }

        return true;
    }

    static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                sum++;
            } else {
                sum--;
            }
        }
        return sum;
    }
}
