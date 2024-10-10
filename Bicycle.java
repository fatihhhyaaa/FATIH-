
public class Bicycle extends Vehicle {
    private String bikeType;

    public Bicycle() {
        super();
        bikeType = "";
    }

    public Bicycle(int numWheels, double price, String bikeType) {
    super(numWheels, price);
    this.bikeType = bikeType;
    }      

    public String getBikeType() {
    return this.bikeType;
    }

    public void setBikeType(String bikeType) {
    this.bikeType = bikeType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Type of Bike: " + bikeType);
    }
}
