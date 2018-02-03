package modelling;

import java.util.Date;

public class Woman extends Resident {
    private Date lastSeenByHairDresser;

    public Woman(String firstName, String lastName, int yearOfBirth) {

        super(firstName, lastName, yearOfBirth);
    }

    @Override
    public String toString() {

        return super.toString() + "\n" + "last seen by hairdresser: " + lastSeenByHairDresser;
    }
}
