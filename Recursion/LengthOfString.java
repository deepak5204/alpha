package Recursion;

public class LengthOfString {

    public static int calcLength(String str){
        if(str.length() == 0){
            return 0;
        }

        int smallStringLength = calcLength(str.substring(1));
        return smallStringLength +1;
    }
    
    public static void main(String[] args){
        String  str = "deepak";
        int res = calcLength(str);
        System.out.println(res);

    }
}
