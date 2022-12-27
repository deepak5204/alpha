package JavaStack;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else {
                //closing
                if(s.peek() == '(' && ch == ')' // ()
                || s.peek() == '{' && ch == '}' //{}
                || s.peek() == '[' && ch == ']' //[]
                 ){
                    s.pop();
                } else { //not make correct pair
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str = "({}[{}])[]";

       boolean result = isValid(str);
       System.out.println(result);
    }
}
