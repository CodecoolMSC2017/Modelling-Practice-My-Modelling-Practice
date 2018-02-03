package home;

import com.sun.corba.se.impl.naming.cosnaming.NamingUtils;
import home.model.ResidentType;
import home.service.HomeService;
import home.service.Validator;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to my house: ");

        HomeService homeService = HomeService.getInstance();
        String type = "MAN";
        String firstName = "MAte";
        String lastName = "adad";
        String yearOfBirth = "kiscska";

        //while amig az bukik addig ne engedje tovabb
        boolean isYearValid = Validator.validateYear(yearOfBirth);


        try {
            homeService.createResident(type, firstName, lastName, yearOfBirth);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }


}
