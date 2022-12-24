package JavaLinkedList;

public class LinkedList {
 
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add node from first
    public void addFirst(int data){  // O(1)
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 - newNode next = head
        newNode.next = head; //link

        //step 3 - head = newNode
        head = newNode;
    }


    //add node from last
    public void addLast(int data){
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step 2 - tail next = newNode
        tail.next = newNode;

        //step 3 - tail = newNode
        tail = newNode;
    }


    //print linked list
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add in middle
    public void addInMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //Make before break
        newNode.next = temp.next;
        temp.next = newNode;

    }


    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addInMiddle(2, 3);
        ll.print();
        System.out.println(size);

    }
}
