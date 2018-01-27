package com.codecool;

public class Recreation extends Items{
    protected String nameOfRecreation;
    protected int energyLevelIncrease;

    public Recreation(String nameOfRecreatString, int energyLevelIncrease){
        this.nameOfRecreation = nameOfRecreatString;
        this.energyLevelIncrease = energyLevelIncrease;

    }
    public String getNameOfRecreation() {
        return nameOfRecreation;
    }

    public int getEnergyLevelIncrease() {
        return energyLevelIncrease;
    }

}