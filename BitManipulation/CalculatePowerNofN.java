package BitManipulation;

public class CalculatePowerNofN {
    public static int calculatePower(int n) {
        int ans = 1;
        int a = n;
        while(n > 0){
            if((n & 1) == 1){
                ans *= a;
            }
            a = a* a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(calculatePower(8));
        
    }
}
