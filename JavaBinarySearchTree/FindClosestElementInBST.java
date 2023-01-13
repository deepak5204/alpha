package JavaBinarySearchTree;

public class FindClosestElementInBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    static int min = Integer.MAX_VALUE;
    static int ans = 0;
    static int minDiff = Integer.MAX_VALUE;
    static int diff = Integer.MAX_VALUE;
    public static int findClosest(Node root, int key){
        if(root == null){
            return 0;
        }

        if(root.data == key){
            ans = root.data;
            return root.data;
        }

        if(root.data > key){
            diff = root.data - key;
        } else {
            diff = key - root.data;
        }

        if(minDiff > diff){
            ans = root.data;
            minDiff = diff;
        }

        findClosest(root.left, key);
        findClosest(root.right, key);
        return ans;

    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);


        int res = findClosest(root, 5);
        System.out.println(res);
    }
}
