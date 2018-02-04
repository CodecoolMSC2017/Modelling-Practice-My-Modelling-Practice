package services;

import java.io.IOException;
import java.util.Scanner;

public class Menu {


    public void mainMenu() {
        HomeService homeService = HomeService.getInstance();
        String[] menupoints = {"Create new Simulation", "Load existing simulation"};
        int menuChoice = 0;
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("--- Main menu ---");
            for (int i = 0; i < menupoints.length; i++) {
                System.out.println("(" + (i + 1) + "). " + menupoints[i]);
            }
            System.out.println("(0). Exit");

            try {
                menuChoice = Integer.parseInt(scan.nextLine());
                switch (menuChoice) {
                    case 1:
                        subMenu();
                        break;
                    case 2:
                        try {
                            homeService.load();
                            subMenu();
                        } catch (IOException | ClassNotFoundException e) {
                            System.out.println("There's no saved simulation");
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid menupoint.\n");
            }
        }
    }

    public void subMenu(){
        HomeService homeService = HomeService.getInstance();
        String[] menupoints = {"List current residents living in the flat", "Find a resident by name","Create resident","Exit"};
        int menuChoice = 0;
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("--- Main menu ---");
            for (int i = 0; i < menupoints.length; i++) {
                System.out.println("(" + (i + 1) + "). " + menupoints[i]);
            }
            System.out.println("(0). Exit");

            try {
                menuChoice = Integer.parseInt(scan.nextLine());
                switch (menuChoice) {
                    case 1:
                        homeService.listing();
                        subMenu();
                        break;
                    case 2:
                        System.out.println("Please enter the name who you searching for first or last name: ");
                        String person=scan.nextLine();
                        homeService.findWithName(person);
                        subMenu();
                        break;
                    case 3:  System.out.println("The first step in this journey to create a resident for my flat.");
                        System.out.println("you will need a resident type which is either MAN,WOMAN,ANIMAL");
                        String type = scan.nextLine();
                        System.out.println("you will need a resident first name: ");
                        String firstName = scan.nextLine();
                        System.out.println("you will need a resident last name: ");
                        String lastName = scan.nextLine();
                        System.out.println("you will need a resident year of birth: ");
                        String yearOfBirth = scan.nextLine();

                        boolean isYearValid = Validator.validateYear(yearOfBirth);
                        try {
                            homeService.createResident(type, firstName, lastName, yearOfBirth);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    case 0:
                    System.exit(0);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid menupoint.\n");
            }
        }

    }
}
