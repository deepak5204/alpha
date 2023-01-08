package JavaBinaryTree;
import java.util.*;

public class DeleteLeafNodeWithValueAsX {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deleteLeafNode(Node root, int x){
        if(root == null){
            return null;
        }
            
            root.left = deleteLeafNode(root.left, x);
            root.right = deleteLeafNode(root.right, x);

            if(root.left == null && root.right == null && root.data == x){
                return null;
            }
            return root;
    }


    //Print tree level order 
    public static void printTree(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data +" ");

                if(currNode.left != null){
                    q.add(currNode.left);
                } 
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }


    //Preorder
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        printTree(root);
        // preorder(root);
        deleteLeafNode(root, 3);
        printTree(root);
        System.out.println();
        // preorder(root);

    }
}
