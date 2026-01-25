public class ElectricityBill {

    public static void main(String[] args) {
        String[] consumer = {
            "Raman",
            "Balaji",
            "Public School",
            "ABC Hardware",
            "R.M.K Industry"
        };

        int[] category = {1, 2, 3, 4, 4}; 
        int[] units = {85, 255, 925, 650, 13750};
        
        double rate = 0, bill;
        System.out.printf("%-20s %-10s %-10s %-15s%n", "Consumers", "Category", "Units", "Bill Amount (Rs)");
        System.out.println("----------------------------------------------------------");

        for(int i = 0; i < consumer.length; i++) {
            switch(category[i]) {
                case 1: rate = 1.00;
                break;
                case 2: rate = 1.75;
                break;
                case 3: rate = 2.50;
                break;
                case 4: rate = 3.00;
                break;
            }
            
            bill = units[i] * rate;
            System.out.printf("%-20s %-10d %-10d %-15.2f%n", consumer[i], category[i], units[i], bill);
        }
    }
}