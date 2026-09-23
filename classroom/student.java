class student {

    int roll;
    String name;
    static String college = "BIT Durg";

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Ankit");
        Student s2 = new Student(2, "Rahul");

        s1.display();
        s2.display();
    }
}