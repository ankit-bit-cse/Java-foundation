class Outer {
    void show() {

        class Inner {
            void display() {
                System.out.println("Method Local Inner Class");
            }
        }

        Inner i = new Inner();
        i.display();
    }
}

class InnerClass3 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
    }
}