class Number {
	int x;

	public Number(int x) {
		this.x = x;
	}
}

class Square extends Number {
	public Square(int x) {
		super(x);
	}

	public void printSquare() {
		System.out.println("Square of " + x + " is: " + (x * x));
	}
}

class Cube extends Square {
	public Cube(int x) {
		super(x);
	}

	public void printCube() {
		System.out.println("Cube of " + x + " is: " + (x * x * x));
	}
}

public class C39_MultilevelInheritanceDemo2 {
	public static void main(String[] args) {
		Cube cube = new Cube(5);
		cube.printSquare();
		cube.printCube();
	}
}