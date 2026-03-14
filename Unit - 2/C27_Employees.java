class C27_Employees {

	// Instance variables
	int Employees_id;
	String Employees_name;
	double salary;

	// Parameterized Constructor
	C27_Employees(int id, String name, double sal) {
		Employees_id = id;
		Employees_name = name;
		salary = sal;
	}

	// Method to display Employees details
	void display() {
		System.out.println("Employees ID    : " + Employees_id);
		System.out.println("Employees Name  : " + Employees_name);
		System.out.println("Salary         : " + salary);
	}

	public static void main(String[] args) {

		// Creating objects using parameterized constructor
		C27_Employees e1 = new C27_Employees(101, "Amit Shah", 45000);
		C27_Employees e2 = new C27_Employees(102, "Neha Patel", 52000);

		System.out.println("Employees 1 Details:");
		e1.display();

		System.out.println("\nEmployees 2 Details:");
		e2.display();
	}
}