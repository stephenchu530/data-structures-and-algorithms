package fifoAnimalShelter;

import java.util.Date;

// Generic queue class
public class AnimalQueue {
    private Animal front;
    private Animal back;

    public Animal getFront() {
        return this.front;
    }

    public void setFront(Animal front) {
        this.front = front;
    }

    public Animal getBack() {
        return this.back;
    }

    public void setBack(Animal back) {
        this.back = back;
    }

    public AnimalQueue() {
        this.setFront(null);
        this.setBack(null);
    }

    public void enqueue(String value) {
        Animal newAnimal = new Animal(value);
        if (this.front == null)
            this.setFront(newAnimal);
        else
            this.back.setNext(newAnimal);
        this.setBack(newAnimal);
    }

    public String dequeue() {
        if (this.getFront() == null)
            throw new IllegalStateException("Cannot dequeue an empty queue!");
        String tempValue = (String) this.getFront().getValue();
        this.setFront((Animal) this.getFront().getNext());
        return tempValue;
    }

    public Date peakDate() {
        return this.getFront().getDate();
    }
}
