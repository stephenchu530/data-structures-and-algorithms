package fifoAnimalShelter;

import java.util.Date;

public class Animal<T> extends Node {
    private Date date;

    public Date getDate() {
        return this.date;
    }
    public Animal(T value) {
        super(value);
        this.date = new Date();
    }
}
