package com.hillel.lesson14.task1;
//Task 1. Remove Person duplicates
        /*1) В Дз11 был метод который возвращает 100 случайных людей.
        Написать метод который который удалит из этого списка добликаты по имени и фамилии.
        Т.е. останутся только люди с уникальной комбинайцией имя+фамилия. Остальные поля в расчет не берутся.*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        PersonFactory.generatePersonsList(personsList,100);
        System.out.println(personsList);
        System.out.println("\nЧисло людей в списке = " + personsList.size());
    }
}