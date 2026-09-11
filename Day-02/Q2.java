class Q2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.show();
    }
}

class Employee {
    String name = "Employee";

    void display() {
        System.out.println("Parent class method");
    }
}

class Manager extends Employee {
    String name = "Manager";

    void show() {
        System.out.println("Name: " + super.name);
        super.display();
    }
}