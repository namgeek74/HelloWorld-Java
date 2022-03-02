package com.HelloWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("(]{}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("({})"));
        Car str = new Car(10, "Volvo");
        System.out.println(str.renderStatement());
        Person person = new Person();
        person.setName("Nam");
        System.out.println(person.getName());
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
}
