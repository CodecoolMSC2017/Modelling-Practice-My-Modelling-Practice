package services;

import modelling.Location;
import modelling.ResidentType;

public class Validator {


    public static boolean validateYear(String year) {
        try {
            Integer y = Integer.valueOf(year);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year: " + year);
            return false;
        }
        return true;
    }

    public static boolean residentValidateType(String type) {
        try {
            ResidentType t = ResidentType.valueOf(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type: " + type);
            return false;
        }
        return true;
    }

    public static boolean locationValidateType(String type) {
        try {
            Location l = Location.valueOf(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type: " + type);
            return false;
        }
        return true;
    }

}
