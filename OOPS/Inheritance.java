package OOPS;

public class Inheritance {
    public static void main(String[] args){
        Fish f1 = new Fish();
        f1.eat();
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


// derived class
class Fish extends Animal{
    void swim(){
        System.out.println("swiming");
    }

}