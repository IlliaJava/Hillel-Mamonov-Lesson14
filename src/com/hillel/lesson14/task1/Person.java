package com.hillel.lesson14.task1;

public class Person {
    private final String firstName;
    private final String familyName;
    private final int age;
    private final int height;
    private final int weight;

    public Person(String firstName, String familyName, int age, int height, int weight) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nPerson{" + "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight + "}";
    }
}
