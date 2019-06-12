package fifoAnimalShelter;

public class AnimalShelter {
    private AnimalQueue catQ;
    private AnimalQueue dogQ;

    public AnimalShelter() {
        this.catQ = new AnimalQueue();
        this.dogQ = new AnimalQueue();
    }

    public void enqueue(String petType) {
        if (petType == "dog") {
            this.dogQ.enqueue("dog");
        } else {
            this.catQ.enqueue("cat");
        }
    }

    public String dequeue(String petType) {
        String pet = null;
        if (petType == "dog") {
            if (this.dogQ.getFront() == null)
                pet = "There are no doggos :(";
            else
                pet = this.dogQ.dequeue();
        } else if (petType == "cat") {
            if (this.catQ.getFront() == null)
                pet = "There are no kittehs :(";
            else
                pet = this.catQ.dequeue();
        } else if (petType == null) {
            if ((this.catQ.getFront() == null) && this.dogQ.getFront() == null) {
                pet = null;
            } else {
                if (this.catQ.getFront() == null) return this.dogQ.dequeue();
                if (this.dogQ.getFront() == null) return this.catQ.dequeue();
                int comparison = this.catQ.peakDate().compareTo(this.dogQ.peakDate());
                if (comparison == -1) {
                    pet = this.catQ.dequeue();
                } else {
                    pet = this.dogQ.dequeue();
                }
            }
        }
        return pet;
    }
}
