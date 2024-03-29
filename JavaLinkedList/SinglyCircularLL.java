package JavaLinkedList;

public class SinglyCircularLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(int data){
        //step1- create first node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head;
        // step3- head = newNode
        head = newNode;
        tail.next = head;
    }

    public void printCLL(){
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    //add Last
    public void addLast(int data){
        //step 1 create Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2- tail next = newNode
        tail.next = newNode;

        //step3- tail = newNode
        tail = newNode;
        tail.next = head;
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args){
        SinglyCircularLL SCLL = new SinglyCircularLL();
        SCLL.addFirst(3);
        SCLL.addFirst(2);
        SCLL.addFirst(1);
        SCLL.addLast(4);
        SCLL.addLast(5);

        SCLL.printCLL();
       
    }
}
