package JavaQueue;
import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void printNonRepeatong(String s){  //O(n)
        //create frequency array
        int[] freq = new int[26]; // a-z
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            q.add(currChar);
            freq[currChar - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            } else{
                System.out.print(q.peek()+" ");
            }
        }

    }
    public static void main(String[] args){
        String str = "aabdd"; //string must have lower case letter
        printNonRepeatong(str);
    }
}
