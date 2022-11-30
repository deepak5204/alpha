package OOPS;

public class MethodOverloading {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5,4));
        System.out.println(cal.sum(2.4f, 5.3f));
        System.out.println(cal.sum(1, 2, 3));
    }
    
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
