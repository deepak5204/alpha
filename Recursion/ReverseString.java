package Recursion;

import java.util.Scanner;

public class ReverseString {

    public static void printRevString(String str){
        if(str.length() == 0){
            return;
        }

        printRevString(str.substring(1));
        System.out.print(str.charAt(0));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        printRevString(str);
    }
}
