package Recursion;

public class CalculateSumOfNnumber {

    public static int calcFactorial(int n){
        //base case
        if(n == 0){
            return 1;
        }
        int smallOutput = calcFactorial(n - 1);  //recursive call

        //small work
        return n * smallOutput;
    }
    public static void main(String[] args){
        int res = calcFactorial(5);
        System.out.println(res);
    }
}
