package com.company;

public class Client {


    public static void main(String[] args) {


        Director director = new Director();
        MealBuilder vegMeal = new BuildVegMenu();
        MealBuilder nonVeg = new BuildChickenMenu();


        director.construct(vegMeal);
        Meal meal1 = vegMeal.getMeal();

        System.out.println("Veg Meal");
        meal1.show();
        System.out.println("Total cost: "+ meal1.getPrice());

    }

}
