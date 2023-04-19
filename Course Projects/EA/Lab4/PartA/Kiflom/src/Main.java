import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address a = new Address("52", "100 N 4th St", "1234" );

        Car kiflomCar = new Car("Kiflom","Nissan", 15000,"T2020", 10000, a );

        Car Bazen = new Car("Bazen","Nissan", 15000,"T2020", 10000, a );

        //System.out.println(kiflomCar);

        System.out.println(kiflomCar.getAddress());


        int as,b;
        int grade;


//        while (true) {
//            Scanner num = new Scanner(System.in);
//            System.out.println("Enter an integer");
//             grade = num.nextInt();
//
//            if(grade == 0)
//                System.exit(0); // break // return;
//             if (grade == 10 || grade == 9) {
//                a = 1; b = 2;
//                System.out.println(a);
//                System.out.println(b);
//
//            } else if (grade == 8) {
//                a = 3;
//                b = 4;
//                System.out.println(a);
//                System.out.println(b);
//            } else {
//                a = 5;
//                System.out.println(a);
//            }
//        }


        // i will call the address table here

        // datantyes = primitive and non primitive
            // non primitive = String, Class, Array,


        kiflomCar.testMethod(10);



    }
}