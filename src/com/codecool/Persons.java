package com.codecool;
import java.util.Random;


public class Persons extends Residents{
    protected int energyLevel;
    protected int knowledgeLevel;
    
    public Persons(String firstName, String lastName, int birthOfYear,int energyLevel,int knowledgeLevel){
        super(firstName, lastName, birthOfYear);
        this.knowledgeLevel = knowledgeLevel;
        this.energyLevel = energyLevel;
    }
    public int getKnowledgeLevel(){
        return knowledgeLevel;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    
    public int setKnowledgeLevel(){
        Random rand = new Random();
        return knowledgeLevel+rand.nextInt(15);
    }

    public int setEnergyLevel(int energyLevel){
       if (energyLevel>0){
          return (this.energyLevel+energyLevel);
       }
       else{
           return (this.energyLevel-energyLevel);
       }
    }

    public int doStuff(String type){
        if(type.toLowerCase().equals("learning")){
        }
        return 0;
    }


}