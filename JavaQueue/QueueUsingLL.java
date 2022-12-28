package JavaQueue;

public class QueueUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        //empty 
        public boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public void add(int data){  //O(n)
            //create new node
            Node newNode = new Node(data);
            if(head == null){
                head = tail =newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public int remove(){ //O(n)
            if(isEmpty()){
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head){
                tail = head = null;
            } else{
                head = head.next;
            }
            return front;
        }

        //peek
        public int peek(){  //O(n)
            if(isEmpty()){
                return -1;
            }
            return head.data; 
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        //print queue
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
