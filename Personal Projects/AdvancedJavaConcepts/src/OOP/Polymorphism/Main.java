package OOP.Polymorphism;

public class Main {
    private int x; // Protecting total access

    private void returnSomething()  {
        System.out.println("Return");
    }

    // other classes use it without knowing how it is working - Abstraction
    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        // first usage of polymorphism
        OverLoading ol = new OverLoading();
        System.out.println("Sum int " + ol.sum(2,3));

        System.out.println("Sum double " + ol.sum(4.5, 5.5));

        // Using operator overriding



    }
}
