package Backtracking;

public class FindPermutation {
    public static void printPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }


        //recursion
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, ans+currChar);
        }

    }
    public static void main(String[] args){
        String str = "abc";
        printPermutation(str, "");
    }
}
