// 39. Class Number has a variable x which is an integer number, Class Square is derived from 
// class number which prints square of the given number and class Cube is derived from class 
// Square which prints the cube of the integer number. Write a program to demonstrate the 
// mechanism. 

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