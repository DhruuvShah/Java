public class C24_RectangleDefaultConstructor {
	double length;
	double width;

	C24_RectangleDefaultConstructor() {
		this.length = 1.0;
		this.width = 1.0;
	}

	public void displayArea() {
		double area = length * width;
		System.out.println("Area: " + area);
	}

	public static void main(String[] args) {
		C24_RectangleDefaultConstructor rect1 = new C24_RectangleDefaultConstructor();
		rect1.displayArea();
	}

}