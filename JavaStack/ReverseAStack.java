package JavaStack;
import java.util.Stack;

public class ReverseAStack {


    //print stack
    public static void printStack(Stack<Integer> s){
        while(! s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    //push at bottom
    public static void pushAtBottom(Stack<Integer> s, int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //reverse stack
    public static void reverseStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
