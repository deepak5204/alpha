package Recursion;

public class CalculateXpowerN {
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int powOfNm1 = calcPower(x, n - 1);
        return x * powOfNm1;
    }
    public static void main(String[] args) {
        int res = calcPower(2,5);
        System.out.println(res);
    }
}
