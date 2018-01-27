package com.codecool;

public class NonDigitalReacreation extends Recreation{
    protected String pageCount;
    protected String titleOfBook;

    public NonDigitalReacreation(String nameOfRecreatString, int energyLevelIncrease,String pageCount, String titleOfBook){
        super(nameOfRecreatString, energyLevelIncrease);
        this.pageCount = pageCount;
        this.titleOfBook = titleOfBook;
    }

}