package com.codecool;

public class Residents{
    protected String firstName,lastName;
    protected int birthOfYear;

    public Residents(String firstName, String lastName, int birthOfYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public int getBirthOfYear(){
        return birthOfYear;
    }
}