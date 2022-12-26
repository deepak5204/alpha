package JavaStack;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Popup;

public class StackUsingArrayList {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = peek();
            list.remove(list.size() - 1);
            return val;
        }   
    }


    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
