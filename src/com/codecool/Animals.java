package com.codecool;

public class Animals extends Residents{
    protected int hungerLevel;

    public Animals(String firstName, String lastName, int birthOfYear,int hungerLevel){
        super(firstName, lastName, birthOfYear);
        this.hungerLevel = hungerLevel;
    }

    public int getHungerLevel(){
        return hungerLevel;
    }
}