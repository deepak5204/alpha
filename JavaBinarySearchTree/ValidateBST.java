package JavaBinarySearchTree;

public class ValidateBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    //construct BST
    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        } else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    //Print BST
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    // Isvalidate
    /*
        check if max vlue in left subtree < node
        and min value in right subtree > node
     */
    public static boolean isValidateBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidateBST(root.left, min, root) && isValidateBST(root.right, root, max);
    }

    public static void main(String[] args){
        int[] values = {1, 1, 1};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();


        System.out.println(isValidateBST(root, null, null) ? "VALID" : "NOT VALID");
    }
}
