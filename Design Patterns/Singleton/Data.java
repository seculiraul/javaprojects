package com.company;

public class Data {


    private static Data instance = new Data();


    private Data() {

    }

    public void open() {

        //CONNECTION FOR DATABASE
        //OPEN DATABASE

    }

    public void close() {


        //CLOSE DATABASE
    }

    public static Data getInstance() {
        return instance;
    }
}
