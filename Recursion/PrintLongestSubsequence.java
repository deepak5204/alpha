package Recursion;

import java.util.*;

public class PrintLongestSubsequence {

    public static void printSubsequence(String str, int i, StringBuilder newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        printSubsequence(str, i+1, newStr.append(currChar));
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        printSubsequence(str, 0, new StringBuilder());
    }
}
