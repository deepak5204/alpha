package Recursion;

import java.util.Scanner;

public class MoveX_atEnd {

    // O(N + Count) = (N)
    public static String moveX(String str, StringBuilder newStr, int i, int count){
        if(i == str.length()){
            System.out.println(count);
            for(int j = 1; j <= count; j++){
                newStr.append('x');
            }
            return newStr.toString();
        }

        if(str.charAt(i) == 'x'){
            count++;
            return moveX(str, newStr, i+1, count);
        } else {
            newStr.append(str.charAt(i));
            return moveX(str, newStr, i+1, count);
        }

        

       
        
    }

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder newStr = new StringBuilder();
    sc.close();

    System.out.println(moveX(str, newStr, 0, 0));
    }
}
