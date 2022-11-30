package OOPS;

/*
 ***METHOD OVERRIDING - Parent class and child class both contain the same function with different defination.
 */

public class MethodOverriding {
    public static void main(String[] args){
        Hindi hin = new Hindi();
        hin.write();
    }
    
}


class Notes{
    void write(){
        System.out.println("Writing anything");
    }
}

class Hindi extends Notes{
    void write(){
        System.out.println("Hindi Notes writing");
    }
}