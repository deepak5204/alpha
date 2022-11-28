package BitManipulation;

public class CheckOddOrEven {
    public static void checkNumber(int n) {
        int bitMarks = 1;
        if((bitMarks & n) == 1){
            System.out.println("Odd nunmber");
        } else {
            System.out.println("Even number");
        }
    }
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(7);
        
    }
}
