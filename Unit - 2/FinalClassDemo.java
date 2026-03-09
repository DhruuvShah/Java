final class Vehicle {
  void show() {
    System.out.println("This is a Vehicle class.");
  }
}

// Trying to inherit final class (NOT ALLOWED) - Compile-time error
// class Car extends Vehicle {
// }

public class FinalClassDemo {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    v.show();

  }

}