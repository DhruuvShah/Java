
class SuperClass {
    SuperClass() {
        System.out.println("Super Class Constructor");
    }
}

public class SuperConstructorDemo extends SuperClass {
    SuperConstructorDemo() {
        super();
        System.out.println("Sub Class Constructor");
    }

    public static void main(String[] args) {
        SuperConstructorDemo m = new SuperConstructorDemo();
    }
}