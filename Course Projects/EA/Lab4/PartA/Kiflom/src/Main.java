public class Main {
    public static void main(String[] args) {

        Car kiflomCar = new Car("Kiflom","Nissan", 15000,"T2020", 10000 );

        System.out.println(kiflomCar.getName());

      //  System.out.println(kiflomCar.getOwner());

        // setter - passing value
        // let me set the car owner as Bazen

        kiflomCar.setOwner("Bazen");
        System.out.println( "Car owner " + kiflomCar.getOwner());






    }
}