import java.util.Scanner;

class SalarySlip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Company Name: ");
		String company = sc.nextLine();

		System.out.print("Enter Employee ID: ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Department: ");
		String department = sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Joining Date (dd/mm/yyyy): ");
		String joinDate = sc.nextLine();

		System.out.print("Enter Basic Salary: ");
		double basic = sc.nextDouble();


		double ta = basic * 5 / 100;
		double ma = basic * 2.5 / 100;
		double grossSalary = basic + ta + ma;
		double pf = grossSalary * 5.5 / 100; 
		double salaryAfterPF = grossSalary - pf;
		double it = salaryAfterPF * 7 / 100; 
		double netSalary = salaryAfterPF - it;


		System.out.println("\n------------ SALARY SLIP ------------");
		System.out.printf("Company Name     : %s%n", company);
		System.out.printf("Employee ID      : %d%n", empId);
		System.out.printf("Department       : %s%n", department);
		System.out.printf("Employee Name    : %s%n", name);
		System.out.printf("Joining Date     : %s%n", joinDate);
		System.out.println("-------------------------------------");


		System.out.printf("Basic Salary     : %.2f%n", basic);
		System.out.printf("TA (5%%)          : %.2f%n", ta);
		System.out.printf("MA (2.5%%)        : %.2f%n", ma);
		System.out.printf("Gross Salary     : %.2f%n", grossSalary);
		System.out.println("-------------------------------------");
		System.out.printf("PF (5.5%%)        : %.2f%n", pf);
		System.out.printf("IT (7%%)          : %.2f%n", it);
		System.out.println("-------------------------------------");
		System.out.printf("Net Salary       : %.2f%n", netSalary);
		System.out.println("-------------------------------------");
		sc.close();
	}
}