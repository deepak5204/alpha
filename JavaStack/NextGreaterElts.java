/*
 * Next Greater Element
 * The next greater element of some element x in an array is the first greater element 
 * that is to the right of x in the same array.
 * 
 * Sample Input: arr[6, 8, 0, 1, 3]
 * sample Output: next greater = [8, -1, 1, 3, -1]
 */


package JavaStack;
import java.util.Stack;

public class NextGreaterElts {
    public static void main(String[] args){
        // int[] arr = {6, 8, 0, 1, 3};
        int[] arr = {2, 8, 5, 3, 7, 4, 6};
        int[] nxtGreater = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        //step1- check stack not empty and stack top whith array elements
        for(int i = arr.length -1; i >= 0; i--){
            while(! s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //step2- if else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i] = arr[s.peek()];
            }
            //step3- push in stack
            s.push(i);
        }

        //print next greater
        for(int i = 0; i < nxtGreater.length; i++){
            System.out.println(nxtGreater[i]);
        }

        ////****** IT MAY ASK IN FOUR WAYS ********////
        // next Greater Right
        // next Greater left
        // next Smaller Right
        // next Smaller left
    }
}
