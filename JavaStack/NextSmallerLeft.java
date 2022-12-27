package JavaStack;
import java.util.Stack;

public class NextSmallerLeft {
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 6, 2, 3}; //output -> -1 -1 1 5 1 2 
        int[] nxtSL = new int[arr.length];
        
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            //step1- check stack is not empty and arr[i] less than staktop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            //step2- if else
            if(s.isEmpty()){
                nxtSL[i] = -1;
            } else {
                nxtSL[i] = arr[s.peek()];
            }
            //step3- push in stack
            s.push(i);
        }


        //print next smaller from left
        for(int i = 0; i < nxtSL.length; i++){
            System.out.print(nxtSL[i]+" ");
        }

    }
}
