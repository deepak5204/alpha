package OOPS;

public class MultipleInheritance {
    public static void main(String[] args){
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
    
}

interface Herbivore{
    void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

//use properties of herbivore and carnivore

class Bear implements Herbivore, Carnivore{

    @Override
    public void eatMeat() {
       System.out.println("Bear eat meat"); 
    }

    @Override
    public void eatGrass() {
        System.out.println("Bear eat grass ");
    }
    
}
