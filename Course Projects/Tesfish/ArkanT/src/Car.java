public class Car {
    private String name;
    private String model;
    private double price;
    private int milage;
    private String plateNumber;


    public Car(String name, String model, double price, int milage, String plateNumber) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.milage = milage;
        this.plateNumber = plateNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getMilage() {
        return milage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", milage=" + milage +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Car tesfayCar = new Car("Toyota", "2023", 3500.0, 3000, "2030B");
        Car kifCar = new Car("Nissa", "2023", 3500.0, 3000, "230B");
        Car bazCar = new Car("Tesla", "2023", 3500.0, 3000, "2030vB");

         tesfayCar.setName("Mazda"); // assigning value

        tesfayCar.setMilage(3005);
        int mile = tesfayCar.getMilage();
        System.out.println(mile);


        System.out.println(tesfayCar.getName()); // getting



    }


}
