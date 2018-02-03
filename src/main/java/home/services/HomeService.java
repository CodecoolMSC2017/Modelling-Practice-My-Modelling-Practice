package services;


import modelling.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static modelling.ResidentType.*;

public class HomeService {
    private List<Resident> residents;

    private volatile static HomeService homeServiceInstance;

    private HomeService() {
        residents = new ArrayList<Resident>();
    }

    public static HomeService getInstance() {
        if (homeServiceInstance == null) {
            synchronized (HomeService.class) {
                if (homeServiceInstance == null) {
                    homeServiceInstance = new HomeService();
                }
            }
        }
        return homeServiceInstance;
    }

    public void listing() {
        for (Resident resident : residents) {
            System.out.println(resident.toString());
        }
    }

    public void findWithName(String name) {
        List<Resident> result = new ArrayList<Resident>();
        for (Resident resident : residents) {
            if (resident.getFirstName().equalsIgnoreCase(name) || resident.getLastName().equalsIgnoreCase(name)) {
                result.add(resident);
            }
        }
        for (Resident resident : result) {
            System.out.println(resident.toString());
        }
    }

    public void createResident(String type, String firstName, String lastName, String yearOfBirth) {
        ResidentType residentType = valueOf(type);
        int yearOfBirthint = Integer.valueOf(yearOfBirth);
        switch (residentType) {
            case ANIMAL:
                residents.add(new Animal(firstName, lastName, yearOfBirthint));
                break;
            case MAN:
                residents.add(new Man(firstName, lastName, yearOfBirthint));
                break;
            case WOMAN:
                residents.add(new Woman(firstName, lastName, yearOfBirthint));
                break;
        }

    }

    public void setLocationFor(String name, String locationString) {
        Location location = Location.valueOf(locationString);
        boolean votIlyen = false;
        for (Resident resident : residents) {
            if (resident.getFirstName().equalsIgnoreCase(name) || resident.getLastName().equalsIgnoreCase(name)) {
                resident.setLocation(location);
                votIlyen = true;
            }
        }
        if (!votIlyen) {
            System.out.println("nem vot ilyen");
        }
    }

    public void save() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("myfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(residents);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public ArrayList<String> load() throws IOException, ClassNotFoundException {
        ArrayList<String> arraylist = new ArrayList<String>();
        try {
            FileInputStream fis = new FileInputStream("myfile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return arraylist;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return arraylist;
        }
        return arraylist;
    }
    // listaba tolti a file-t
    //residents = (betoltott lista)
}
//TODO save method implementation
}