import main.Test;

// this i use tkjdfhaksldf sdhaksdfhkasdf b
public class Car {

    // proporties
    private String owner;
    private String name;
    private int mileage;
    private String model;
    private double price;
    private Address a;

    private Test test;

    public Car(String owner, String name, int mileage, String model, double price, Address a) {
        this.name = name;
        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.owner = owner;
        this.a = a;
        // i will add other non primitive

    }    public Car(String owner, String name, int mileage, String model, double price) {
        this.name = name;
        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.owner = owner;

    }

    // method = behevior

    public void engineStart() {
        System.out.println("Engine started");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String name) {
        this.owner = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", mileage=" + mileage +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", address=" + a +
                '}';
    }

    public Address getAddress() {
        return  a;
    }

    public void testMethod(int a) {
        System.out.printf("a's value is  " + a);
    }

}
