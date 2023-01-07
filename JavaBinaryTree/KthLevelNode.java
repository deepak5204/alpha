package JavaBinaryTree;

import java.util.*;

public class KthLevelNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    
    static int level = 1;
    public static void kLevelNode(Node root, int k) {  // O(n)
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                level++;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (level == k) { // print kth level data
                    System.out.print(curr.data + " ");
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    //print kth level node recursively
    public static void printKthLevelNode(Node root, int level, int k){  // O(n)
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
            return;
        } 

        printKthLevelNode(root.left, level+1, k);
        printKthLevelNode(root.right, level+1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        // kLevelNode(root, 1);

        printKthLevelNode(root, 1, 3);
    }

}
