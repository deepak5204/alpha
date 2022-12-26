package JavaStack;
import java.util.Stack;

public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
         while(i < str.length()){
            s.push(str.charAt(i));
            i++;
         }

         StringBuilder ans = new StringBuilder();

         while(! s.isEmpty()){
            ans.append(s.pop());
         }

         return str = ans.toString();
    }
    public static void main(String[] args){
        String str = "abc";

        String res = reverse(str);
        System.out.println(res);
    }
}
