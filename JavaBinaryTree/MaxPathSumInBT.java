
/*
    constraint - Path can start at any Node and end at any node but it should always continuous
    --> path may or may not go through root
    --> Path can have one node minimum.


 */
package JavaBinaryTree;

public class MaxPathSumInBT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static int max = Integer.MIN_VALUE;

    //Preorder Traversal
    public static int preorder(Node root){
        if(root == null){
            return 0;
        }

        int left = Math.max(preorder(root.left), 0);
        int right = Math.max(preorder(root.right), 0);
        max = Math.max(max, left + right + root.data);
        return Math.max(left, right) + root.data;
    }

    public static int maxPathSum(Node root){
        preorder(root);
        return max;
       }

    public static void main(String[] args){
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        
        int res = maxPathSum(root);

        System.out.println(res);

    }    
}
