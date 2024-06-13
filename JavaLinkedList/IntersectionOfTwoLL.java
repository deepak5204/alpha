
// Intersection Of Two Linked Lists
/*
    In a system there are two singly linked list. By some error, the end node of one of the linked lists got linked to the second list, forming an inverted Y shaped list wrire a program to get the point where to linkedl lists merge.
 */

package JavaLinkedList;

public class IntersectionOfTwoLL {  // TC= O(m*n)
                                    // sc= O(1)
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //find intersection Point
    public Node getIntersection(Node h1, Node h2){
        while(h2 != null){
            Node temp = h1;
            while(temp != null){
                if(temp == h2){
                    return h2;
                }
                temp = temp.next;
            }
            h2 = h2.next;
        }
        return null;
    }
    public static void main(String[] args){
        IntersectionOfTwoLL list = new IntersectionOfTwoLL();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
        
        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        // System.out.println(head1.next.data);
        // System.out.println(head2.next.next.next.data);
        
        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        System.out.println(list.getIntersection(head1, head2).data);



    }
}
