/*
    For a linked list of the form: L(1) -> L(2) -> L(3) -> L(4) ....... L(n-1) -> L(n)
    convert it into a zigzag form i.e. : L(1) -> L(n) -> L(2) -> L(n-2) -> L(3) -> L(n-3) ........
 */


 /*
  * //  Approach
    1.  find mid node (1st half last node) - using slow fast pointer
    2.  reverse second half (separate left and right)
    3.  Alternate merging
        Node lh = 1st half head
        Node rh = 2nd half head
        Node nextL, nextR
        while(lh != null && rh != null){
            nextL = lh.next;
            nextR = rh.next;
            lh.next = rh;
            rh.next = nextL;
            lh = nextL;
            rh = nextR;
        }
  */

package JavaLinkedList;

public class ZigZagLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //add from last
    public void addLast(int data){
        //step1- create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            tail.next = null;
            return;
        }

        //step2- tail next = newNode
        tail.next = newNode;

        //step3- update tail = newNode
        tail = newNode;
    }

    //print Linked List
    public void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //find mid
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    //reverse LL
    public Node reverseLL(Node head){
        Node curr = head.next;
        head.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    //Zig Zag Linked list (i.e. 1->n-1->2->n-2_ _ _)
    public void ZZLL(Node head){

        Node mid = getMid(head);

        Node rh = reverseLL(mid);
        Node lh = head;

        Node nextL;
        Node nextR;

        while(lh != null && rh != null){
            nextL = lh.next;
            nextR = rh.next;
            lh.next = rh;
            rh.next = nextL;

            rh = nextR;
            lh = nextL;
        }


    }




    public static Node head;
    public static Node tail;
    public static void main(String[] args){
       ZigZagLL zz = new ZigZagLL();
       zz.addLast(1);
       zz.addLast(2);
       zz.addLast(3);
       zz.addLast(4);
       zz.addLast(5);
       zz.addLast(6);
       zz.addLast(7);

       zz.print(head);

       zz.ZZLL(head);
       System.out.println();

       zz.print(head);


    }
}
