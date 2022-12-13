package Recursion;

public class NumberConvertIntoString {
    static String [] digit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    //print digit function
    public static void printDigit(int num){
        if(num == 0){
            return;
        }
        printDigit(num/10);
        int lastdigit = num % 10;
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main(String[] args){
        printDigit(21354);
    }
}
