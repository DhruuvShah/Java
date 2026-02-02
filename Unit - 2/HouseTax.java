// M & N. Program to calculate House Tax for Ahmedabad Municipal Corporation

// Base class
class House {
    int houseNumber;
    String ownerName;
    String address;
    double propertyValue;
    double tax;

    // Constructor
    House(int hNum, String owner, String addr, double value) {
        houseNumber = hNum;
        ownerName = owner;
        address = addr;
        propertyValue = value;
    }

    // Method to calculate tax for owner-occupied house
    void calculateTax() {
        // Tax = 0.5% of property value for owner-occupied
        tax = propertyValue * 0.005;
    }

    // Method to display house details
    void displayDetails() {
        System.out.println("========================================");
        System.out.println("      HOUSE TAX DETAILS");
        System.out.println("========================================");
        System.out.println("House Number     : " + houseNumber);
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Address          : " + address);
        System.out.println("Property Value   : Rs. " + propertyValue);
        System.out.println("Occupation Type  : Owner-Occupied");
        System.out.println("Tax Rate         : 0.5% of property value");
        System.out.println("----------------------------------------");
        System.out.println("House Tax        : Rs. " + tax);
        System.out.println("========================================\n");
    }
}

// Derived class for rented houses
class RentedHouse extends House {
    double annualRent;

    // Constructor
    RentedHouse(int hNum, String owner, String addr, double value, double rent) {
        super(hNum, owner, addr, value);
        annualRent = rent;
    }

    // Overriding calculateTax method for rented house
    @Override
    void calculateTax() {
        // Tax = 10% of annual rent for rented houses
        tax = annualRent * 0.10;
    }

    // Overriding display method to show additional details
    @Override
    void displayDetails() {
        System.out.println("========================================");
        System.out.println("      HOUSE TAX DETAILS");
        System.out.println("========================================");
        System.out.println("House Number     : " + houseNumber);
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Address          : " + address);
        System.out.println("Property Value   : Rs. " + propertyValue);
        System.out.println("Annual Rent      : Rs. " + annualRent);
        System.out.println("Occupation Type  : Rented");
        System.out.println("Tax Rate         : 10% of annual rent");
        System.out.println("----------------------------------------");
        System.out.println("House Tax        : Rs. " + tax);
        System.out.println("========================================\n");
    }
}

public class HouseTax {
    public static void main(String[] args) {
        System.out.println("=== AHMEDABAD MUNICIPAL CORPORATION ===");
        System.out.println("         HOUSE TAX CALCULATION");
        System.out.println("========================================\n");

        // Owner-occupied houses
        System.out.println("OWNER-OCCUPIED HOUSES:\n");

        House house1 = new House(101, "Rajesh Patel", "Satellite, Ahmedabad", 5000000);
        house1.calculateTax();
        house1.displayDetails();

        House house2 = new House(102, "Priya Shah", "Vastrapur, Ahmedabad", 7500000);
        house2.calculateTax();
        house2.displayDetails();

        // Rented houses
        System.out.println("\nRENTED HOUSES:\n");

        RentedHouse rented1 = new RentedHouse(201, "Amit Kumar", "Navrangpura, Ahmedabad", 4000000, 240000);
        rented1.calculateTax();
        rented1.displayDetails();

        RentedHouse rented2 = new RentedHouse(202, "Neha Desai", "CG Road, Ahmedabad", 6000000, 360000);
        rented2.calculateTax();
        rented2.displayDetails();

        RentedHouse rented3 = new RentedHouse(203, "Kiran Mehta", "Bodakdev, Ahmedabad", 5500000, 300000);
        rented3.calculateTax();
        rented3.displayDetails();

        // Summary
        double totalTax = house1.tax + house2.tax + rented1.tax + rented2.tax + rented3.tax;

        System.out.println("========================================");
        System.out.println("           TAX SUMMARY");
        System.out.println("========================================");
        System.out.println("Total Houses Assessed: 5");
        System.out.println("Owner-Occupied Houses: 2");
        System.out.println("Rented Houses        : 3");
        System.out.println("----------------------------------------");
        System.out.println("Total Tax Collected  : Rs. " + totalTax);
        System.out.println("========================================");

        // Demonstrating polymorphism
        System.out.println("\n=== POLYMORPHISM DEMONSTRATION ===");
        House[] allHouses = new House[3];
        allHouses[0] = new House(301, "Vikram Singh", "Thaltej, Ahmedabad", 4500000);
        allHouses[1] = new RentedHouse(302, "Sanjay Joshi", "Prahlad Nagar, Ahmedabad", 5000000, 280000);
        allHouses[2] = new RentedHouse(303, "Meera Patel", "Ambawadi, Ahmedabad", 4800000, 250000);

        double polyTotal = 0;
        for (House h : allHouses) {
            h.calculateTax();
            polyTotal += h.tax;
        }

        System.out.println("Total tax from polymorphic array: Rs. " + polyTotal);

        System.out.println("\n=== TAX CALCULATION RULES ===");
        System.out.println("1. Owner-Occupied: 0.5% of property value");
        System.out.println("2. Rented: 10% of annual rent");
    }
}