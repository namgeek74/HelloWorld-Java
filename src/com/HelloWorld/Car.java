package com.HelloWorld;

public class Car {
    int ageCar;
    String nameCar;

    public Car(int age, String name) {
        ageCar = age;
        nameCar = name;
    }

    public String renderStatement() {
        return "This is " + nameCar + " model, and it is " + ageCar + " years";
    }
}
