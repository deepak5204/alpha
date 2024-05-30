package Recursion;

public class CalculateXpowerN {


    //  Optimized approach
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(x, n/2);
        int halfPowerSquare = halfPower * halfPower;

        //n is odd
        if(n % 2 == 1){
            halfPowerSquare = x * halfPowerSquare;
        }
            return halfPowerSquare;
    }


    //  Brute force approach
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int powOfNm1 = calcPower(x, n - 1);
        return x * powOfNm1;
    }



    public static void main(String[] args) {
        // int res= calcPower(2,5);
        int res = optimizedPower(2, 5);
        System.out.println(res);
    }
}
