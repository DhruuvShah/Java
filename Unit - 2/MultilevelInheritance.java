// D. Program to demonstrate Multilevel Inheritance

// Grandparent Class
class Vehicle {
    String brand;

    void setBrand(String b) {
        brand = b;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Parent Class (inherits from Vehicle)
class Car extends Vehicle {
    int seats;

    void setSeats(int s) {
        seats = s;
    }

    void displaySeats() {
        System.out.println("Number of Seats: " + seats);
    }
}

// Child Class (inherits from Car)
class SportsCar extends Car {
    int topSpeed;

    void setTopSpeed(int speed) {
        topSpeed = speed;
    }

    void displayTopSpeed() {
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }

    void displayAllInfo() {
        System.out.println("\n=== Sports Car Details ===");
        displayBrand(); // From Vehicle class
        displaySeats(); // From Car class
        displayTopSpeed(); // From SportsCar class
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance Demo ===");

        SportsCar ferrari = new SportsCar();

        // Using methods from all three levels
        ferrari.setBrand("Ferrari"); // From Vehicle
        ferrari.setSeats(2); // From Car
        ferrari.setTopSpeed(340); // From SportsCar

        ferrari.displayAllInfo();

        System.out.println("\nAnother Example:");
        SportsCar lamborghini = new SportsCar();
        lamborghini.setBrand("Lamborghini");
        lamborghini.setSeats(2);
        lamborghini.setTopSpeed(350);
        lamborghini.displayAllInfo();
    }
}