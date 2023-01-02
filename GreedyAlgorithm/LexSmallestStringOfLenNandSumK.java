package GreedyAlgorithm;
import java.util.*;

public class LexSmallestStringOfLenNandSumK {

    public static void lexoSmallStr(int n, int k){
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');

        for(int i = n-1; i>= 0; i--){
            k -= i;
            if(k >= 0){
                if(k >= 26){
                    arr[i] = 'z';
                    k -= 26;
                }
                else{
                    arr[i] = (char)('a'+k-1);
                    k -= arr[i] - 'a'+1;
                }
            }
            else{
                break;
            }
            k += i;
        }

        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            newStr.append(arr[i]);
        }

        System.out.println(newStr);

    }
    public static void main(String[] args){
        int n = 4, k = 28;

        lexoSmallStr(n, k);

    }
}
