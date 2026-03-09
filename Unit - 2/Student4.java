class Person4 {
    String name = "Parent Name";
}

public class Student4 extends Person4 {
    String name = "Child Name";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }

    public static void main(String[] args) {
        Student4 s = new Student4();
        s.display();
    }
}