package modelling;

import java.io.Serializable;

public class Resident implements Serializable {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Location location;

    public Resident(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("first name: " + firstName + "\n");
        sb.append("last name: " + lastName + "\n");
        sb.append("last name: " + lastName + "\n");
        if (location != null) {
            sb.append("location: " + String.valueOf(location));
        }
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}