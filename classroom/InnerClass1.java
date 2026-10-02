class Outer {
    private int x = 10;

    class Inner {
        void display() {
            System.out.println(x);
        }
    }
}

class InnerClass1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        i.display();
    }
}