package BitManipulation;

public class SwapTwoNmber {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println("before swaping "+"x = "+x+" y = "+y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("after swaping "+"x = "+x+" y = "+y);     
        
    }
}
