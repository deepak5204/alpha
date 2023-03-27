package String;
import java.util.*;

public class ReverseEachLetterOfString{

    //MAIN FUNCTION 
    public static void main(String[] args){
        String s = "my name is deepak";
        // reverse(s);
        reverseUsingStack(s);
    }


    //SOLVE USING STACK
    public static void reverseUsingStack(String s){
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            stk.push(s.charAt(i));

            if(s.charAt(i) == ' ' || i == s.length()){
                while(!stk.isEmpty()){
                    System.out.print(stk.peek());
                    stk.pop();
                }
            }
        }

        System.out.print(" ");
        while(!stk.isEmpty()){
            System.out.print(stk.peek());
            stk.pop();
        }
    }

    //USING LOOP
    public static void reverse(String s){ 
        String res = "";
        for(int i = 0; i < s.length(); i++){
            int j = i; 
            String s2 = "";
            while(j < s.length() && s.charAt(j) != ' '){
                s2 += s.charAt(j);
                i++;
                j++;
            }

            for(int k = s2.length() - 1; k >= 0; k--){
                res += s2.charAt(k);
            }
            res += ' ';
        }
        
        System.out.println(res);
        System.out.println(res.length());
    }
}