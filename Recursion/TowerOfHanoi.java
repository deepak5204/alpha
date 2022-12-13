package Recursion;

public class TowerOfHanoi {
    public static void trackMovement(int n, String source, String dest, String helper){
        //base case
        if(n == 1){
            System.out.println("Transfer disk "+n+" move from "+ source +" to "+ dest);
            return;
        }

        //small work and function call

        //move n-1 disk from source to helper using destination as a helper
        trackMovement(n - 1, source, helper, dest);
        System.out.println("Transfer disk "+n+" move from "+ source +" to "+ dest);
        
        //move n-1 disk from helper to source using destination as a helper
        trackMovement(n - 1, helper, dest, source);
        
    }
    public static void main(String[] args) {
        trackMovement(3, "S", "D", "H");
        
    }
}
