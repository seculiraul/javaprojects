package com.company;

import java.sql.Wrapper;

public interface Item {

    String name();
    Pack packing();
    float price();

}

abstract class Burger implements Item {

    @Override
    public Pack packing() {
        return new Wrapperr();
    }

    public abstract float price();
}

class VegBurger extends Burger {


    @Override
    public String name() {
        return "VEG BURGER";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}

class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 45.5f;
    }
}


abstract class Drink implements Item {



    @Override
    public Pack packing() {
        return new Bottle();
    }

 public abstract float price();

}


class Coke extends Drink {


    @Override
    public String name() {
        return "Coca-Cola";
    }

    @Override
    public float price() {
        return 5f;
    }
}


class Pepsi extends Drink {


    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 6.5f;
    }
}


