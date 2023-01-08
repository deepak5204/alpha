package JavaBinaryTree;

public class InvertBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node invertTree(Node root){
        if(root == null){
            return root;
        }
        if(root.left == null && root.right == null){
            return root;
        }


        Node leftNode = invertTree(root.left);
        Node rightNode = invertTree(root.right);

        // int temp = leftNode.data;
        // leftNode.data = rightNode.data;
        // rightNode.data = temp;

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }


    //Preorder traversal
    public static void printTree(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);
        root.right.right = new Node(7);

        printTree(root);
        root = invertTree(root);
        System.out.println();
        printTree(root);
    }
}
