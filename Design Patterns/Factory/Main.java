package com.company;

public class Main {

    public static void main(String[] args) {

        AnimalFactory animal = new AnimalFactory();

        Animal animal1 = animal.getAnimalFactory("TIGER");
        animal1.sound();
        Animal animal2 = animal.getAnimalFactory("DUCK");
        animal2.sound();

    }
}
