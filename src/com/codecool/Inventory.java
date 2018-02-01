package com.codecool;

import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Exception;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class Inventory {


    String inventoryName;
    Items[] items;
  
    public Inventory(String inventoryName, Items[] items) {
        this.inventoryName = inventoryName;
        this.items = items;
    }

    public Items[] getInventory() {
        return items;
    }

    public void addToInventory(Items things) {
        Items[] tmpArray = new Items[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmpArray[i] = items[i];
        } if (items.length <= 4) {  
            tmpArray[tmpArray.length - 1] = things;
            items = tmpArray;
                System.out.println("- " + things.getItemName() + " added to your inventory.");
        } else {
            System.out.println("\nYour inventory is full.\n");
        }
    }
  
    public void removeFromInventory(int index, Items[] things){
        Items[] tmpArray = new Items[items.length - 1];
        int count = 0;
        String removedItem = "";
        for (int i = 0; i < items.length; i++) {
            if (index == (i + 1)) {
                count = 1;
                removedItem = items[i].getItemName();
            } else {
                tmpArray[i - count] = items[i];
            }
        }
        items = tmpArray;
        System.out.println("\n" + removedItem + " removed.\n");
    }
    
    public void searchInInventory(String find) {
        for (int i = 0; i < items.length; i++) {
            if (find.equals(items[i].getItemName())) {
                System.out.println(items[i].toString());
            }
        }
    }

    public void displayInventory(String name) {
        System.out.println("\nInventory:");
        for (int i = 0; i < items.length; i++) {
            if (name.equals(":list")) {
                System.out.println((i + 1) + ". " + items[i].getItemName());
            }
        }
    }

}