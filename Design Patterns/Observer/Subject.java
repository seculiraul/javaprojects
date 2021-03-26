package com.company;


import java.util.ArrayList;
import java.util.Iterator;

interface Subject {

    void register(Observer obj);
    void unregister(Observer obj);
    void notifier();
}


class CricketData implements Subject {

    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observersList;

    public CricketData() {
        observersList = new ArrayList<Observer>();
    }



    @Override
    public void register(Observer obj) {

        observersList.add(obj);

    }

    @Override
    public void unregister(Observer obj) {

        observersList.remove(observersList.indexOf(obj));
    }


    @Override
    public void notifier() {

        for (Iterator<Observer> it = observersList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(runs, wickets, overs);

        }
    }

    public int getRuns() {
        return 90;
    }

    public int getWickets() {
        return 2;
    }

    public float getOvers() {
        return 10.2f;
    }


    public void dataChange() {


        runs = getRuns();
        wickets = getWickets();
        overs = getOvers();
        notifier();


    }
}


