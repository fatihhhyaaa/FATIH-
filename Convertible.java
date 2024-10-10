
public class Convertible extends Car {
    private String roofType;

    public Convertible() {
        super();
        roofType = "";
    }

    public Convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, price, numDoors, isElectric);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Type of Roof: " + roofType);
    }
}