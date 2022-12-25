package JavaLinkedList;

public class DoubleLL {
    
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //add first
    public void addFirst(int data){
        //create new Node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //newNode next = head
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //print Linked List
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }


    //remove First
    public int removeFist(){
        if(size == 0){
           return Integer.MIN_VALUE;
        }

        if(size == 1){
            head = null;
            size--;
            return head.data;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }


    //add from last
    public void addLast(int data){
        //step1- create Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    //remove from last
    public int removeLast(){
        if(head == null){
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }


    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);

        dll.print();
        System.out.println();
        System.out.println(size);

        dll.removeFist();
        dll.print();
        System.out.println();
        System.out.println(size);

        dll.removeLast();
        dll.print();
        

    }
}
