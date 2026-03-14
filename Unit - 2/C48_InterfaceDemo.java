interface Shape2 {
	void findArea(); // abstract method
}

class Circle2 implements Shape2 {
	double radius = 5;

	public void findArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle = " + area);
	}
}

class Rectangle2 implements Shape2 {
	double length = 10;
	double breadth = 4;

	public void findArea() {
		double area = length * breadth;
		System.out.println("Area of Rectangle = " + area);
	}
}

public class C48_InterfaceDemo {
	public static void main(String[] args) {
		// Added the "2" to match your definitions above!
		Shape2 s1 = new Circle2();
		s1.findArea();

		Shape2 s2 = new Rectangle2();
		s2.findArea();
	}
}