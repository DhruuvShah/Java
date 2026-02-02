import java.util.Scanner;

class SalarySlipSlab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Company Name: ");
		String company = sc.nextLine();

		System.out.print("Enter Employee ID: ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Department: ");
		String dept = sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Joining Date (dd/mm/yyyy): ");
		String joinDate = sc.nextLine();

		System.out.print("Enter Basic Salary: ");
		double basic = sc.nextDouble();
		double taPer, maPer, pfPer, itPer;

		if (basic < 30000) {
			taPer = 5;
			maPer = 2.5;
			pfPer = 5.5;
			itPer = 7;
		} else if (basic >= 30000 && basic <= 50000) {
			taPer = 5.5;
			maPer = 3.5;
			pfPer = 6.5;
			itPer = 9;
		} else if (basic > 50000 && basic <= 80000) {
			taPer = 6;
			maPer = 4;
			pfPer = 7;
			itPer = 12;
		} else {
			taPer = 7;
			maPer = 5;
			pfPer = 8;
			itPer = 14;
		}

		double ta = basic * taPer / 100;
		double ma = basic * maPer / 100;
		double grossSalary = basic + ta + ma;

		double pf = grossSalary * pfPer / 100;
		double salaryAfterPF = grossSalary - pf;

		double it = salaryAfterPF * itPer / 100;
		double netSalary = salaryAfterPF - it;

		System.out.println("\n----------- SALARY SLIP -----------");
		System.out.printf("Company Name     : %s%n", company);
		System.out.printf("Employee ID      : %d%n", empId);
		System.out.printf("Department       : %s%n", dept);
		System.out.printf("Employee Name    : %s%n", name);
		System.out.printf("Joining Date     : %s%n", joinDate);
		System.out.println("-----------------------------------");
		System.out.printf("Basic Salary     : %.2f%n", basic);
		System.out.printf("TA (%.1f%%)        : %.2f%n", taPer, ta);
		System.out.printf("MA (%.1f%%)        : %.2f%n", maPer, ma);
		System.out.printf("Gross Salary     : %.2f%n", grossSalary);
		System.out.println("-----------------------------------");
		System.out.printf("PF (%.1f%%)        : %.2f%n", pfPer, pf);
		System.out.printf("IT (%.1f%%)        : %.2f%n", itPer, it);
		System.out.println("-----------------------------------");
		System.out.printf("Net Salary       : %.2f%n", netSalary);
		System.out.println("-----------------------------------");
		sc.close();
	}
}