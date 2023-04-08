public class Car {

    // proporties
    private String owner;
    private String name;
    private int mileage;
    private String model;
    private double price;

    public Car(String owner, String name, int mileage, String model, double price) {
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





}
