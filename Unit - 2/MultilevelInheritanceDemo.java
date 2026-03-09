class Person2 {
    String name;
    int age;

    Person2(String n, int a) {
        name = n;
        age = a;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Employee2 extends Person2 {
    int empId;
    double salary;

    Employee2(String n, int a, int id, double sal) {
        super(n, a);
        empId = id;
        salary = sal;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID : " + empId);
        System.out.println("Salary      : ₹" + salary);
    }
}

class Manager extends Employee2 {
    String department;
    int teamSize;

    Manager(String n, int a, int id, double sal, String dept, int tSize) {
        super(n, a, id, sal);
        department = dept;
        teamSize = tSize;

    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department  : " + department);
        System.out.println("Team Size   : " + teamSize);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager("Kavita", 38, 301, 105000, "Marketing", 12);
        m1.displayManager();
    }
}
