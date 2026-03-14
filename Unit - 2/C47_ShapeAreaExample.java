
abstract class Shape {
	public abstract double calculateArea();

	public void display() {
		System.out.println("This is a shape.");
	}
}

class circle2 extends Shape {
	double radius;

	public circle2(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class rectangle2 extends Shape {
	double length;
	double width;

	public rectangle2(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
}

public class C47_ShapeAreaExample {

	public static void main(String[] args) {
		Shape circle = new circle2(5);
		Shape rectangle = new rectangle2(4, 6);

		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
	}

}