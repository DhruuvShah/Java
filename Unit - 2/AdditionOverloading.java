public class AdditionOverloading {

    AdditionOverloading(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    AdditionOverloading(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }

    AdditionOverloading(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {

        AdditionOverloading obj1 = new AdditionOverloading(10, 20);
        AdditionOverloading obj2 = new AdditionOverloading(1, 2, 3);
        AdditionOverloading obj3 = new AdditionOverloading(1, 2, 3, 4);
    }
}