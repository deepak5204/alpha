package JavaBinarySearchTree;

public class KthSmallestElementInBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    static int c = 0;
    public static void inorder(Node root, int k){
        if(root == null){
            return;
        }

        inorder(root.left, k);
       c++;
       if(c == k){
        System.out.println(root.data);
        return;
       }
        inorder(root.right, k);
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);

      inorder(root , 4);

    }
}
