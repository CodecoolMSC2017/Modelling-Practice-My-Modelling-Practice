package com.codecool;

public abstract class Thing {


    public String name;

    protected Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
