package com.company;

public interface MealBuilder {

    void buildBurger();
    void buildDrink();
    Meal getMeal();

}




class BuildVegMenu implements MealBuilder {


    Meal vegMeal = new Meal();


    @Override
    public void buildBurger() {

        vegMeal.add(new VegBurger());
    }

    @Override
    public void buildDrink() {

        vegMeal.add(new Coke());

    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}


class BuildChickenMenu implements MealBuilder {


    Meal vegMeal = new Meal();


    @Override
    public void buildBurger() {

        vegMeal.add(new ChickenBurger());
    }

    @Override
    public void buildDrink() {

        vegMeal.add(new Pepsi());

    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

