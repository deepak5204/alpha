package JavaQueue;
// import java.util.*;

import java.util.Stack;

public class GenerateBinaryNumber {
    public static void main(String[] args){
        int n = 10;
        // Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 1; i <= n; i++){
            // q.add(i);
            int num = i;

            while(num > 0){
                int r = num%2;
                s.push(r); 
                num = num/2;  
            }
            
            //print  stack
            while(!s.isEmpty()){
                System.out.print(s.pop());
            }

            System.out.print(' ');
        }

    }
}
