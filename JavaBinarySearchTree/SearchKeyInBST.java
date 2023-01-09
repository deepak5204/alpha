package JavaBinarySearchTree;

public class SearchKeyInBST {
    static class Node {
        int data;
        Node left;
        Node right;

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
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Search key in BST
    public static boolean search(Node root, int key){   // TC - O(H)
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args){
        int [] values = {5, 1, 3, 4, 6, 7, 2};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);

        int key = 3;
       boolean res = search(root, key);
       System.out.println();

       System.out.println(res ? "Found" : "Not Found");

    }
}
