package OOPS;

public class AbstractKeyword {
    public static void main(String[] args) {

        // constructor channing
        // Tree constructor(1) --> Neem constructor(2) --> Uses constructor(3)
        Uses u = new Uses();
        u.height();

        // Neem n1 = new Neem();
        // n1.leaf();
        // n1.height();

        // Aqualiptus a1 =new Aqualiptus();
        // a1.height();

    }

}

abstract class Tree {

    // constructor
    Tree() {
        System.out.println("Tree constructor called.");
    }

    void leaf() {
        System.out.println("Trees have green leafs");
    }

    abstract void height();
}

class Neem extends Tree {

    // constructor
    Neem() {
        System.out.println("Neem constructor called");
    }

    // define abstract method of parent class
    @Override
    void height() {
        System.out.println("Neem height range between 20-25 meter");
    }
}

class Uses extends Neem{

    // constructor
    Uses(){
        System.out.println("Uses custommer called");
    }

}

// class Aqualiptus extends Tree {

//     // aqualiptus
//     Aqualiptus() {
//         System.out.println("Aqualiptus constructor called");
//     }

//     // define abstract method of parent class
//     @Override
//     void height() {
//         System.out.println("height range between 60-100 meter");
//     }
// }