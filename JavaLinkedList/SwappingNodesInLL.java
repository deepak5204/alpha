/*
 * We have a linked list and two keys in it, swap nodes for two given keys.
 * Nodes should be swapped by changing links. Swapping data of nodes may be expensive in many situationss when data contains many fields.
 * It may be assumed that all keys in the linked list are distinct.
 * 
 * Sample Input: 1->2->3->4->5, k1 = 2, k2 = 4
 * sampel output: 1->4->3->2->5
 */


package JavaLinkedList;

public class SwappingNodesInLL {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(Node head, int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }


    
    public void printLL(Node temp){
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void swap(Node head, int k1, int k2){

        Node f1 = null, f2 = null, pf1 = null, pf2 = null;

        Node temp = head;

        while(temp.next != null){
            if(temp.next.data == k1){
                f1 = temp.next;
                pf1 = temp;
            }

            if(temp.next.data == k2){
                f2 = temp.next;
                pf2 = temp;
            }
            temp = temp.next;
        }

        pf1.next = f2;
        pf2.next = f1;
        Node t2 = f1.next;
        f1.next = f2.next;
        f2.next = t2;
    }




    public static void main(String[] args){
        SwappingNodesInLL ll = new SwappingNodesInLL();
        Node head = new Node(1);

        ll.addLast(head, 2);
        ll.addLast(head, 3);
        ll.addLast(head, 4);
        ll.addLast(head, 5);
      

        ll.printLL(head);
        System.out.println();


        ll.swap(head, 2, 4);
        ll.printLL(head);


    }
}
