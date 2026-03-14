public class C26_RectangleConstructorExample {
	double length;
	double width;

	public C26_RectangleConstructorExample(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void displayArea() {
		System.out.println("Area: " + (length * width));
	}

	public static void main(String[] args) {
		C26_RectangleConstructorExample rect = new C26_RectangleConstructorExample(3, 9);
		rect.displayArea();
	}

}