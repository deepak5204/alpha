package JavaBinarySearchTree;

public class SortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //create BST
    public static Node createBST(int[] arr, int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = si + (ei - si)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);

        return root;
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 6, 8, 10, 11, 14};
        Node root = createBST(arr, 0, arr.length - 1);

        inorder(root);

        
    }
}
