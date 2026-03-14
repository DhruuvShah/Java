class Person4 {
	String name = "Parent Name";
}

public class C41_SuperKeywordDemo extends Person4 {
	String name = "Child Name";

	void display() {
		System.out.println("Child name: " + name);
		System.out.println("Parent name: " + super.name);
	}

	public static void main(String[] args) {
		C41_SuperKeywordDemo s = new C41_SuperKeywordDemo();
		s.display();
	}
}