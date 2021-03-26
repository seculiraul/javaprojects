package com.company;

public class Director {


    MealBuilder myMealBuilder;

    public void construct(MealBuilder builder) {

        myMealBuilder = builder;

        myMealBuilder.buildBurger();
        myMealBuilder.buildDrink();


    }

}
