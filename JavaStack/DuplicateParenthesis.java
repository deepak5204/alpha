package JavaStack;
import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // s.push(ch);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            }  else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args){
        //String must be a valid string
        String str = "((a+b)+c)";
        boolean result = isDuplicate(str);
        System.out.println(result);
    }
}
