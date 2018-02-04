package modelling;

import java.util.Date;

public class Man extends Resident {
    private Date lastShowerDate;

    public Man(String firstName, String lastName, int yearOfBirth) {
        super(firstName, lastName, yearOfBirth);
    }

    public Date getLastShowerDate() {
        return lastShowerDate;
    }

    public void setLastShowerDate(Date lastShowerDate) {
        this.lastShowerDate = lastShowerDate;
    }

    @Override
    public String toString() {
        if (lastShowerDate != null) {
            return super.toString() + "\n" + "last time had a shower: " + lastShowerDate;
        }
        return super.toString();
    }
}
