package JavaBinarySearchTree;

public class ConstructBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    //Inorder Traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        int [] values = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);

    }
}
