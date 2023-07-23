package FunctionsOrMethods;

public class CheckPrime {

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        // for(int i = 2; i < n-1; i++){
        //     if(n % i == 0){
        //         return false;
        //     }
        // }

        //OPTIMIZED - 1 
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        
        //OPTIMIZED - 2
        // for(int i = 0; i <= n/2; i++){
        //     if(n % i == 0){
        //         return false;
        //     }  
        // }
        return true;
    }
    public static void main(String[] args){
        int n = 4;
        boolean res = isPrime(n);        
        System.out.print(res);
    }
}
