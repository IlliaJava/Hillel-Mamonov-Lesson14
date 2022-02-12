package com.hillel.lesson14.task1;

import java.util.List;
import java.util.Random;

public class PersonFactory {

    static Random RANDOM = new Random();

    /**
     * This method fills list of persons (of type "Person") with actual instances.
     *@param personsList - is original List<Person>, where you would like to add instances.
     * @param personsCount - is how many persons would you like to have in the list
     */
    static void generatePersonsList(List<Person> personsList, int personsCount) {
        for (int i = 1; i <= personsCount; i++) {
            String firstName = String.valueOf(randomName());
            String familyName = String.valueOf(randomFamilyName());
            int age = RANDOM.nextInt(72) + 18;
            int height = RANDOM.nextInt(70) + 140;
            int weight = (int) (weightIndex * height * height / 10000);
            personsList.add(new Person(firstName, familyName, age, height, weight));
        }
    }

    /**
     * weightIndex variable - is based on "Body mass index" values,
     * but only uses "realistic" groups, in range 18..30,
     * means not too big underweight and not overweight.
     */
    public static double weightIndex = (RANDOM.nextInt(120) + 180) / 10.0;

    private enum firstNamesList {
        John, Anna, Tom, Maria, Daniel, Natalia, Simon, Rachel, Ivan, Anastasia, Alex, Peter, Elizabeth
    }

    public static firstNamesList randomName() {
        firstNamesList[] names = firstNamesList.values();
        return names[new Random().nextInt(names.length)];
    }

    public enum familyNamesList {
        Jones, Smith, Middleton, Brown, Garcia, Lopez, Miller, Wilson, Davis, Lee, White, Kind, Wright, Adams, Diaz
    }

    public static familyNamesList randomFamilyName() {
        familyNamesList[] familyNames = familyNamesList.values();
        return familyNames[new Random().nextInt(familyNames.length)];
    }

}