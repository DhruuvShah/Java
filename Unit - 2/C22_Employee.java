class Employee_22 {

	int employee_id;
	String name;
	double salary;
	String department;

	// Method to display employee details
	void display() {
		System.out.println("Employee ID: " + employee_id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {

		// Creating first employee object
		Employee_22 emp1 = new Employee_22();
		emp1.employee_id = 101;
		emp1.name = "Rahul";
		emp1.salary = 35000;
		emp1.department = "IT";

		// Creating second employee object
		Employee_22 emp2 = new Employee_22();
		emp2.employee_id = 102;
		emp2.name = "Priya";
		emp2.salary = 40000;
		emp2.department = "HR";

		// Displaying employee details
		emp1.display();
		emp2.display();
	}
}