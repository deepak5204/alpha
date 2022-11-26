
//Time complexity  O(x*N)
//here x is length of string

package String;

public class PrintLargestString {

    public static void main(String[] args){
        String[] fruits = {"apple", "mango", "banana"};

        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}


