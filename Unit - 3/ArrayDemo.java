import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array has 3 elements. Enter index to access (0-2): ");
        
        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds! Please enter a valid index.");
        } finally {
            scanner.close();
        }
    }
}