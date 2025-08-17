// Ex_1.java
// Demonstrates interface default methods and resolving ambiguity

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        // Resolving ambiguity by specifying the interface
        Vehicle.super.message();
        FourWheeler.super.message();
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message();
    }
}
