
public class Vehicle {
    private int numWheels;
    private double price;

    public Vehicle() {
        numWheels = 0;
        price = 0;
    }

    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number of wheels: " + numWheels);
        System.out.println("Price: " + price);
    }
}