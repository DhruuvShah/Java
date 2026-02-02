// F. Program to calculate Employee Total Pay

class Employee {
    int employeeCode;
    String name;
    String designation;
    double basicPay;
    double hra;
    double ma;
    double da;
    double pf;
    double pt;
    double totalPay;

    // Constructor to assign initial values
    Employee(int code, String empName, String desig, double basic) {
        employeeCode = code;
        name = empName;
        designation = desig;
        basicPay = basic;
        ma = 200; // Medical Allowance is fixed Rs. 200
        pt = 250; // Professional Tax is fixed Rs. 250
    }

    // Method to calculate all allowances and deductions
    void calculatePay() {
        hra = basicPay * 0.10; // HRA = 10% of Basic Pay
        da = basicPay * 0.50; // DA = 50% of Basic Pay
        pf = basicPay * 0.10; // PF = 10% of Basic Pay

        // Total Pay = Basic Pay + HRA + DA + MA - PF - PT
        totalPay = basicPay + hra + da + ma - pf - pt;
    }

    // Method to display employee details and pay structure
    void displayPaySlip() {
        System.out.println("========================================");
        System.out.println("         EMPLOYEE PAY SLIP");
        System.out.println("========================================");
        System.out.println("Employee Code    : " + employeeCode);
        System.out.println("Name             : " + name);
        System.out.println("Designation      : " + designation);
        System.out.println("----------------------------------------");
        System.out.println("Basic Pay        : Rs. " + basicPay);
        System.out.println("HRA (10%)        : Rs. " + hra);
        System.out.println("DA (50%)         : Rs. " + da);
        System.out.println("MA               : Rs. " + ma);
        System.out.println("----------------------------------------");
        System.out.println("Gross Salary     : Rs. " + (basicPay + hra + da + ma));
        System.out.println("----------------------------------------");
        System.out.println("PF (10%)         : Rs. " + pf);
        System.out.println("PT               : Rs. " + pt);
        System.out.println("----------------------------------------");
        System.out.println("Total Deductions : Rs. " + (pf + pt));
        System.out.println("========================================");
        System.out.println("NET PAY          : Rs. " + totalPay);
        System.out.println("========================================\n");
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE PAYROLL SYSTEM ===\n");

        // Creating three employee objects
        Employee emp1 = new Employee(101, "Rajesh Kumar", "Software Engineer", 50000);
        Employee emp2 = new Employee(102, "Priya Sharma", "Senior Manager", 75000);
        Employee emp3 = new Employee(103, "Amit Patel", "Team Lead", 60000);

        // Calculate and display pay for Employee 1
        emp1.calculatePay();
        emp1.displayPaySlip();

        // Calculate and display pay for Employee 2
        emp2.calculatePay();
        emp2.displayPaySlip();

        // Calculate and display pay for Employee 3
        emp3.calculatePay();
        emp3.displayPaySlip();

        // Summary
        System.out.println("=== PAYROLL SUMMARY ===");
        System.out.println("Total employees processed: 3");
        System.out.println("Total payout: Rs. " +
                (emp1.totalPay + emp2.totalPay + emp3.totalPay));
    }
}