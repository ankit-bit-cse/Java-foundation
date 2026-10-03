interface Animal {
    void sound();
}

class InnerClass4 {
    public static void main(String[] args) {

        Animal a = new Animal() {
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        a.sound();
    }
}