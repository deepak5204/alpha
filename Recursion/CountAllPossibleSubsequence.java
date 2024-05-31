package Recursion;

import java.util.Scanner;

public class CountAllPossibleSubsequence {
        public static int printSubsequence(String str, int i, StringBuilder newStr){
        if(i == str.length()){
            // System.out.println(newStr);
            return 1;
        }

        char currChar = str.charAt(i);

        // currChar to be the part of new string
        int temp = printSubsequence(str, i+1, newStr.append(currChar));
          newStr.deleteCharAt(newStr.toString().length()-1);

         int temp2 =  printSubsequence(str, i+1, newStr);
         return temp + temp2;

        //  currChar not to be the part of new string
        

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        // printSubsequence(str, 0, new StringBuilder());

        System.out.println(printSubsequence(str, 0, new StringBuilder()));

    }
}
