package Backtracking;

public class FindSubset {
    public static void printSubset(String str, int i, String ans){
        //Base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
            return;
        }

        // Yes choice
        printSubset(str, i+1, ans+str.charAt(i));

        // No choice
        printSubset(str, i+1, ans);
    }
    public static void main(String[] args){
        String str = "abc";
        printSubset(str, 0, "");
    }
}
