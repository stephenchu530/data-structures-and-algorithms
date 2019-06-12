package fifoAnimalShelter;

public class AnimalShelter {
    private Queue<String> catQ;
    private Queue<String> dogQ;

    public void AnimalShelter() {
        this.catQ = new Queue<>();
        this.dogQ = new Queue<>();
    }
}
