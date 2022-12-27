package JavaStack;
import java.util.Stack;

public class NextSmaller {  //O(n)
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 6, 2, 3}; //1 -1 2 2 -1 -1
        int[] nxtSmaller = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i = arr.length - 1; i >= 0; i--){
            //step1- check stack not empty and stack top whith array elements
                while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                    s.pop();
                }
            //step2- if else
            if(s.isEmpty()){
                nxtSmaller[i] = -1;
            } else{
                nxtSmaller[i] = arr[s.peek()];
            }

            //step3- push in stack
            s.push(i);
        }

         //print next greater
         for(int i = 0; i < nxtSmaller.length; i++){
            System.out.println(nxtSmaller[i]);
        }
    }
}
