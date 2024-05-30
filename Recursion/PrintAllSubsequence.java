package Recursion;

import java.util.*;

public class PrintAllSubsequence{

    public static void printSubsequence(String str, int i, StringBuilder newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);

        // currChar to be the part of new string
        printSubsequence(str, i+1, newStr.append(currChar));
        newStr.deleteCharAt(newStr.toString().length()-1);

        //  currChar not to be the part of new string
        printSubsequence(str, i+1, newStr);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        printSubsequence(str, 0, new StringBuilder());
    }
}