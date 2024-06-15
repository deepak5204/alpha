/*
 *We have a Linked List of intergers, writ a function to modify the linked list such that all even numbers appear before all odd numbers in the modified linked list.
 Also keep the order of even and odd numbers same.
 
 Sample Input: 8->12->10->5->4->1->6->null
 Sample Output: 8->12->10->4->6->5->1->null
 */

package JavaLinkedList;

public class OddEvenLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
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

    void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    Node arrangeLL(Node head){
        Node odd = new Node(-1);
        Node ans = odd;
        Node even = new Node(-1);
        Node ans2 = even;
        Node temp = head;

        while(temp != null){
            if(temp.data % 2 != 0){
                System.out.println(temp.data);
                odd.next = temp;
                odd = odd.next;

            } else {
                even.next = temp;
                even = even.next;
            }
            temp = temp.next;
        }

        odd.next = null;
        // even.next = null;
        // // odd.next = null;
        odd.next = ans2.next;

        return ans;
    }
    public static void main(String[] args){
        OddEvenLL ll = new OddEvenLL();
        Node head = new Node(8);
        ll.addLast(head, 12);
        ll.addLast(head, 10);
        ll.addLast(head, 5);
        ll.addLast(head, 4);
        ll.addLast(head, 1);
        ll.addLast(head,6);

        ll.printLL(head);
        System.out.println();

        Node res = ll.arrangeLL(head);



        ll.printLL(res.next);
    }
}
