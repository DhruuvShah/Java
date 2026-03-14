class Student {
	int id;
	String name;

	void display() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}
}

public class C21_ClassObjectExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 80;
		s1.name = "Dhruv";

		s1.display();
	}
}