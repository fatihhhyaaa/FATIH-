
public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public Car() {
        super();
        numDoors = 0;
        isElectric = false;
    }

    public Car(int numWheels, double price, int numDoors, boolean isElectric) {
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }  

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean IsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Is Electric: " + isElectric);
    }
}