package JavaStack;

public class StackUsingLinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class StackULL{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        //pop
        public int pop(){
            if(head == null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        StackULL s = new StackULL();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!StackULL.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
