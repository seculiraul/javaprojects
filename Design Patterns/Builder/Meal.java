package com.company;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    public List<Item> items;


    public Meal() {

        items = new ArrayList<Item>();
    }


    public void add(Item item) {


        items.add(item);

    }

    public float getPrice() {

        float cost = 0.0f;

        for(Item item : items) {

            cost+=item.price();

        }


        return cost;
    }


    public void show() {


        for(Item item : items) {


            System.out.println("Name: "+ item.name());
            System.out.println("Pack: "+ item.packing().packing());
            System.out.println("Price: "+ item.price());

        }

    }


}
