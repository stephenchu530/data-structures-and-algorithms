package QueueWithStacks;

public class PseudoQueue {
    private Stack stackMain;
    private Stack stackTemp;

    public PseudoQueue() {
        this.stackMain = new Stack();
        this.stackTemp = new Stack();
    }

    public void enqueue(int value) {
        this.stackMain.push(value);
    }

    public int dequeue() {
        if (this.stackMain.getTop() == null)
            throw new IllegalAccessError("Cannot dequeue an empty pseudo queue!");
        while (this.stackMain.getTop() != null) {
            this.stackTemp.push(this.stackMain.pop());
        }
        int value = this.stackTemp.pop();
        while (this.stackTemp.getTop() != null) {
            this.stackMain.push(this.stackTemp.pop());
        }
        return value;
    }
}
