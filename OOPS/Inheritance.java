package OOPS;

public class Inheritance {
    public static void main(String[] args){

        Dog tommy = new Dog();
        tommy.legs(4);

        Bird b = new Bird();
        b.fly();


        // Fish f1 = new Fish();
        // f1.eat();
    }
    
}


//base class
class Animal{
    void eat(){
        System.out.println("eating");
    }

    void breathe(){
        System.out.println("breating");
    }

}

class Mammal extends Animal{
    void legs(int legs){
        System.out.println(legs);
    }
}

class Bird extends Mammal{
    void fly(){
        System.out.println("flying");
    }
}

class Dog extends Mammal{
    String breed;
}


// // derived class
// class Fish extends Animal{
//     void swim(){
//         System.out.println("swiming");
//     }
// }