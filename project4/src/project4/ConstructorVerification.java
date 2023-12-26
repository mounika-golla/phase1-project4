package project4;

public class ConstructorVerification {

    public static void main(String[] args) {
        // Creating objects using different types of constructors
        Car defaultCar = new Car();  // Default constructor
        Car parameterizedCar = new Car("Toyota", "Camry", 2022);  // Parameterized constructor
        Car copyConstructorCar = new Car(parameterizedCar);  // Copy constructor

        // Displaying information about the created objects
        System.out.println("Default Constructor: " + defaultCar);
        System.out.println("Parameterized Constructor: " + parameterizedCar);
        System.out.println("Copy Constructor: " + copyConstructorCar);
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Copy constructor
    public Car(Car otherCar) {
        this.make = otherCar.make;
        this.model = otherCar.model;
        this.year = otherCar.year;
    }

    // Overriding toString() for better object representation
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
