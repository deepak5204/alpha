package String;

public class IsStringPalindrome {

    private static boolean checkPalindrome(String str) {

        // // by using two pointer
        // int si = 0; 
        // int ei = str.length() - 1;
        // while(si < ei){
        //     if(str.charAt(si) != str.charAt(ei)){
        //         return false;
        //     }
        //     si++;
        //     ei--;
        // }
        // return true;

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "abba";
        System.out.println(checkPalindrome(str));
    }
}
