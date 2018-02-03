package modelling;

import java.util.Date;

public class Animal extends Resident {

    private Date lastSeenByVet;

    public Animal(String firstName, String lastName, int yearOfBirth) {
        super(firstName, lastName, yearOfBirth);
    }

    public Date getLastSeenByVet() {
        return lastSeenByVet;
    }

    public void setLastSeenByVet(Date lastSeenByVet) {
        this.lastSeenByVet = lastSeenByVet;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "last seen by vet: " + lastSeenByVet;
    }
}
