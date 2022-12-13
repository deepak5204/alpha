package Recursion;

public class countSubstring {

    public static int cSubstring(String str, int i, int j, int len){
        if(len == 1){
            return 1;
        }
        if(len <= 0){
            return 0;
        }

        int res =   cSubstring(str, i+1, j, len-1) +
                    cSubstring(str, i, j - 1, len-1) -
                    cSubstring(str, i+1, j-1, len-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        String str = "aba";
        int n = str.length();
        System.out.println(cSubstring(str, 0, n-1, n));
    }
}
