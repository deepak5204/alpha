package JavaStack;

import java.util.ArrayList;
public class StackUsingArrayList {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public void push(int data){
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

        while(! Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
        
    }
}
