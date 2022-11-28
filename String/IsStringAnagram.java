package String;

import java.util.Arrays;
import java.util.Scanner;

public class IsStringAnagram {

    public static boolean isAnagram(String str, String newStr){
        if(str.length() == newStr.length()){
            str = str.toLowerCase();
            newStr = newStr.toLowerCase();

            //convert string into character array
            char [] a = str.toCharArray();
            char [] b = newStr.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a, b)){
                return true;
            } else {
                return false;
            }
        } else {
             return false;

        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str = sc.next();
        System.out.println("enter second string");
        String newStr = sc.next();
        sc.close();
        boolean res = isAnagram(str, newStr);
        System.out.println(res);
    }
}
