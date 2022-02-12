package com.hillel.lesson14.task1;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(familyName, person.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName);
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
