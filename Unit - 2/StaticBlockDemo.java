public class StaticBlockDemo {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Initialization block");
    }

    StaticBlockDemo(int y) {
        System.out.println("Within Parameterized Constructor");
    }

    StaticBlockDemo() {
        System.out.println("Within Default Constructor");
    }

    public static void main(String[] args) {
        System.out.println("In main");
        StaticBlockDemo st = new StaticBlockDemo(100);
        System.out.println("-----------------------------------------");
        StaticBlockDemo st1 = new StaticBlockDemo();
    }

}