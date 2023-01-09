package JavaBinarySearchTree;

public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }


    //Construct BST
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

    //print BST
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Print data between k1 & k2 including k1 & k2
    public static void printRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        }
    } 

    public static void main(String[] args){
        int[] values = {8, 4, 3, 1, 6, 5, 7, 15, 20, 25};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        int k1 = 3, k2 = 10;
        printRange(root, k1, k2);
    }
}
