package home.service;

import home.model.ResidentType;

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

    public static boolean validateType(String type) {
        try {
            ResidentType t = ResidentType.valueOf(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type: " + type);
            return false;
        }
        return true;
    }
}
