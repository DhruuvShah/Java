class BankAccount {

    // Instance variables
    int accountNumber;
    String accountHolderName;
    double balance;

    // Default Constructor
    BankAccount() {
        accountNumber = 1001;
        accountHolderName = "Ravi Kumar";
        balance = 5000.0;
    }

    // Method to display account details
    void display() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
    }

    public static void main(String[] args) {

        // Object creation (default constructor is called)
        BankAccount acc = new BankAccount();

        acc.display();
    }
}