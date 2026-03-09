
class SuperClass {
    SuperClass() {
        System.out.println("Super Class Constructor");
    }
}

public class SubClass extends SuperClass {
    SubClass() {
        super();
        System.out.println("Sub Class Constructor");
    }

    public static void main(String[] args) {
        SubClass m = new SubClass();
    }
}