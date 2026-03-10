class Person4 {
    String name = "Parent Name";
}

public class SuperKeywordDemo extends Person4 {
    String name = "Child Name";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }

    public static void main(String[] args) {
        SuperKeywordDemo s = new SuperKeywordDemo();
        s.display();
    }
}