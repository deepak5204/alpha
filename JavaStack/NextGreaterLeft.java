package JavaStack;
import java.util.Stack;
public class NextGreaterLeft { //O(n)
    public static void main(String[] args){
        int[] arr = {2, 8, 5, 3, 7, 4, 6}; //output-> -1 -1 8 5 8 7 7
        int[] nxtGL = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++){
             //step1- check stack is not empty and arr[i] greater than stak top
             while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
             }

             //step2- if else
             if(s.isEmpty()){
                nxtGL[i] = -1;
             } else {
                nxtGL[i] = arr[s.peek()];
             }
             //step3 - push in stack
             s.push(i);
        }

        //print next greater left
        for(int i = 0; i < arr.length; i++){
            System.out.print(nxtGL[i]+" ");
        }
    }
}
