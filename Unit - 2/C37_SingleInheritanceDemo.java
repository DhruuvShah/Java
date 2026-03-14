class Person {
	String name;
	int age;

	Person(String n, int a) {
		name = n;
		age = a;
	}

	void displayPerson() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}

class Student3 extends Person {
	int rollNo;

	Student3(String n, int a, int r) {
		super(n, a);
		rollNo = r;
	}

	void displayStudent() {
		displayPerson();
		System.out.println("Roll No : " + rollNo);
	}
}

public class C37_SingleInheritanceDemo {
	public static void main(String[] args) {
		Student3 s1 = new Student3("Amit", 20, 101);
		s1.displayStudent();
	}
}