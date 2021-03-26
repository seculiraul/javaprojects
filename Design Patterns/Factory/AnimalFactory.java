package com.company;

public class AnimalFactory {

    public Animal getAnimalFactory(String animalType) {

        if(animalType == null)
            return null;
        else if(animalType.equals("TIGER"))
            return new Tiger();

        else if(animalType.equals("DUCK"))
            return new Duck();

        return null;

    }
}
