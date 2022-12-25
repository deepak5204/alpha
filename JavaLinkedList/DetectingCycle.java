package JavaLinkedList;

public class DetectingCycle {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static boolean isCycleFormed(){ //Floyd's CFA (cycle finding algorithm)
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // cycle formed
                return true;
            }
        }
        return false; //not cycle formed
    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        //1->2->3->4->1

        System.out.println(isCycleFormed());
        
    }
}
