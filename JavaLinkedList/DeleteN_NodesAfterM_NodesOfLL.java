package JavaLinkedList;

public class DeleteN_NodesAfterM_NodesOfLL {

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


    public void changeList(Node head, int n, int m){
        Node temp = new Node(-1);
        // Node res = head;

        while(head != null){
            for(int i = 0; i < m; i++){
                if(head == null){
                    break;
                }
                temp.next = head;
                head = head.next;
                temp = temp.next;
            }

            for(int i = 0; i < n; i++){
                if(head == null){
                    break;
                }
                head = head.next;
            }
        }
        temp.next = head;
        // return res
    }



    public static void main(String[] args){
        DeleteN_NodesAfterM_NodesOfLL ll = new DeleteN_NodesAfterM_NodesOfLL();

        Node head = new Node(1);
        ll.addLast(head, 2);
        ll.addLast(head, 3);
        ll.addLast(head, 4);
        ll.addLast(head, 5);
        ll.addLast(head, 6);
        ll.addLast(head, 7);
        ll.addLast(head, 8);
        ll.addLast(head, 9);
        ll.addLast(head, 10);
        ll.addLast(head, 11);
        ll.addLast(head, 12);
        ll.addLast(head, 13);

        ll.printLL(head);
        System.out.println();

        ll.changeList(head, 3, 2);
        ll.printLL(head);

    }
}
