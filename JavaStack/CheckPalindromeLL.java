package JavaStack;
import java.util.Stack;

public class CheckPalindromeLL {
    public class Node{
        char data;
        Node next;

        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(char data){
        // step1 - create newNode
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 tail.next = neeNode
        tail.next = newNode;
        tail = newNode;
    }


    //print LL
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //Palindrome function
    public boolean isPalindrome(Node head){
        Stack<Character> s = new Stack<>();
        Node temp = head;
        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(temp.data != s.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args){
        CheckPalindromeLL cpll = new CheckPalindromeLL();
        cpll.addLast('A');
        cpll.addLast('B');
        cpll.addLast('C');
        cpll.addLast('B');
        cpll.addLast('A');
        // cpll.addLast('0');
        
        // cpll.print();

        if(cpll.isPalindrome(head)){
            System.out.println("Yes It is Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
    
}
