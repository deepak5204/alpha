package Recursion;

import java.util.*;
public class PrintAllUniqueSubsequence {

    public static void printUniqueSubseq(String str, StringBuilder newStr, int i){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        
        printUniqueSubseq(str, newStr.append(currChar), i+1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        StringBuilder newStr = new StringBuilder();

        printUniqueSubseq(str, newStr, 0);
    }
}
