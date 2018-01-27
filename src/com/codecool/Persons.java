package com.codecool;

public class Persons extends Residents{
    protected int energyLevel;
    protected int knowledgeLevel;

    public Persons(String firstName, String lastName, int birthOfYear,int energyLevel,int knowledgeLevel){
        super(firstName, lastName, birthOfYear);
        this.knowledgeLevel = knowledgeLevel;
        this.energyLevel = energyLevel;
    }
    public getKnowledgeLevel(){
        return knowledgeLevel;
    }
    public getEnergyLevel(){
        return energyLevel;
    }

}