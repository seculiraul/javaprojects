package com.company;

public interface Animal {


    void sound();
}


class Tiger implements Animal {


    @Override
    public void sound() {
        System.out.println("ROOOOOOOOOOOW");
    }
}


class Duck implements Animal {


    @Override
    public void sound() {
        System.out.println("MAC MAC");
    }
}
