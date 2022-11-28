package BitManipulation;

public class FastExponentiation {
    public static int calculatePower(int n, int x){
        int ans = 1;
        int a = n;
        while(x > 0){
            if((x & 1) == 1){
                ans *= a;
            }

            a = a * a;
            x =  x >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(calculatePower(2, 5));
        
    }
}
