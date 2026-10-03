class Outer {
    static int x = 20;

    static class Inner {
        void display() {
            System.out.println(x);
        }
    }
}

class InnerClass2 {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();

        i.display();
    }
}