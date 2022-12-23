package JavaArrayList;
import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        //add Operation
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(2, 9); // O(n)

        System.out.println(list);

        // //get operation
        // int element = list.get(2);
        // System.out.println(element);

        // //Remove Operation
        // list.remove(2); //O(n)
        // System.out.println(list);

        // // set Operation
        // list.set(2, 8); // O(n)
        // System.out.println(list);

        // //contains element
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(11));

        // //size of ArrayList
        // System.out.println(list.size()); //here size() is method not properties
    }
    
}
