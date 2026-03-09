public class Addition {

    Addition(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    Addition(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }

    Addition(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {

        Addition obj1 = new Addition(10, 20);
        Addition obj2 = new Addition(1, 2, 3);
        Addition obj3 = new Addition(1, 2, 3, 4);
    }
}