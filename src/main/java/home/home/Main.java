package home;

import services.HomeService;
import services.Validator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to my house: ");

        HomeService homeService = HomeService.getInstance();
        Scanner s = new Scanner(System.in);
        String type = s.nextLine();
        String firstName = s.nextLine();
        String lastName = s.nextLine();
        String yearOfBirth = s.nextLine();
        boolean isYearValid = Validator.validateYear(yearOfBirth);
        while (isYearValid== false) {

        }

        try {
            homeService.createResident(type, firstName, lastName, yearOfBirth);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }


}
