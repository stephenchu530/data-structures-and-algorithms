package fifoAnimalShelter;

import java.util.Date;

public class Animal extends Node {
    private Date date;

    public Date getDate() {
        return this.date;
    }
    public Animal(String petType) {
        super(petType);
        this.date = new Date();
    }
}
