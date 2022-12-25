package JavaLinkedList;

public class RemoveCycleFromLL {

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

    //remove cycle
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle
        prev.next = null;  //last.next = null
    }


    public static Node head;
    public static Node tail;
    public static void main(String[] args){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        temp.next = new Node(4);
        head.next.next.next = temp;

        //1->2->3->4->1

        System.out.println(isCycleFormed());
        removeCycle();
        System.out.println(isCycleFormed());
    }
}
