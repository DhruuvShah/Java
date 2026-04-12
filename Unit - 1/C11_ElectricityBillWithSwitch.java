// 11.An electricity board charges different rates for different categories of 
// consumption of power.  
// Category 1 is domestic users, category 2 is educational institutions, category 3 
// is commercial institutions and category 4 is industries.  
// The tariff for energy consumption is Rs 1.00/unit for category 1, Rs 1.75/unit 
// for category 2, Rs 2.50/unit for category 3 and Rs 3.00/unit for category 4.  
// Write a program to calculate the electricity charges for the following data.

public class C11_ElectricityBillWithSwitch {

	public static void main(String[] args) {
		String[] consumer = { "Raman", "Balaji", "Public School", "ABC Hardware", "R.M.K Industry" };

		int[] category = { 1, 2, 3, 4, 4 };
		int[] units = { 85, 255, 925, 650, 13750 };

		double rate = 0, bill;
		System.out.printf("%-20s %-10s %-10s %-15s%n", "Consumers", "Category", "Units", "Bill Amount (Rs)");
		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < consumer.length; i++) {
			switch (category[i]) {
			case 1:
				rate = 1.00;
				break;
			case 2:
				rate = 1.75;
				break;
			case 3:
				rate = 2.50;
				break;
			case 4:
				rate = 3.00;
				break;
			}

			bill = units[i] * rate;
			System.out.printf("%-20s %-10d %-10d %-15.2f%n", consumer[i], category[i], units[i], bill);
		}
	}

}
