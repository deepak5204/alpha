package OOPS;

public class JavaInterface {
    public static void main(String[] args) {
        Horse h1 = new Horse();

        h1.walk();
        h1.eat();
    }
}

interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {
    void eat();
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }

    public void eat() {
        System.out.println("Eat grass and leafs");
    }
}


