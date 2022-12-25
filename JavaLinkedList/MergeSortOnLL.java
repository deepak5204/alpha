package JavaLinkedList;

public class MergeSortOnLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //print linked list
    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //add first
    public void addFirst(int data){
        //step1 - create newNode 
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        ////step 2 - newNode next = head
        newNode.next = head;

        ////step 3 - head = newNode
        head = newNode;
    }


    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 

    public static Node merge(Node left, Node right){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next; //return mergedLL.next because mergedLL pointing -1
    } 

    //////****MERGE SORT****
    public static Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public static Node head;
    public static void main(String[] args){
        MergeSortOnLL  mrgll = new MergeSortOnLL();
        mrgll.addFirst(1);
        mrgll.addFirst(2);
        mrgll.addFirst(3);
        mrgll.addFirst(4);
        mrgll.addFirst(5);

        mrgll.print(head);

        Node res = mergeSort(head);
        System.out.println();
        mrgll.print(res);
    }
}
