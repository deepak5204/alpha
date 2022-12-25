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


    //Remove from first
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    //Remove From last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }

        //prev : i = size - 2
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        return val;
    }

    //Search in linked list using iterative approach
    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // Key not found
    }


        public int helper(Node head, int key){
            if(head == null){
                return -1;
            }
            
            if(head.data == key){
                return 0;
            }

            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            else{
                idx += 1;
            }
            return idx;
        }

        //Search in linked list using Recursive approach
        public int recursiveSearch(int key){
            return helper(head, key);
        }


        //Reverse a Linked List
        public void reverse(){ //O(n)
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
        }


        // Find and remove Nth node from last
        public void deleteNthNodeFromLast(int n){  //O(n)
            //calculate size
            int sz = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }

            if(size == n){  //remove First node
                head = tail = head.next;
                return;
            }

            int i = 1;
            int idxToFind = sz - n;
            Node prev = head;
            while(i < idxToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }


        //find mid using slow fast approach
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next; // +1
                fast = fast.next.next; // +2
            }
            return slow;
        }


        //check palindrome 
        public boolean checkPalindrome(){
            if(head == null || head.next == null){
                return true;
            }

            Node mid = findMid(head);

            //reverse right half
            Node prev = null;
            Node curr = mid;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node left = head;
            Node right = prev;

            //check left half or right half equal
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }


    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        // ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addInMiddle(2, 3);
        // 1->2->3->4->5->6
        // ll.print(); 
        // // System.out.println(size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(20));

        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(20));


        // ll.print();
        // ll.reverse();
        // ll.print();


        // ll.print();
        // ll.deleteNthNodeFromLast(3);
        ll.print();

        System.out.println(ll.checkPalindrome());

    }
}
