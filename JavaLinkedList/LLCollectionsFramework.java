package JavaLinkedList;
import java.util.LinkedList;;

public class LLCollectionsFramework {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        //add method
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        
        // remove method
        ll.removeFirst();
        ll.removeLast();


        System.out.println(ll);
    }
    
}
