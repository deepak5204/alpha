package JavaBinaryTree;

public class UnivaluedTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static boolean isUnivalued(Node root, int val){
        if(root == null){
            return true;
        }

        if(root.data != val){
            return false;
        }
        
        boolean res1 = isUnivalued(root.left, val);
        boolean res2 = isUnivalued(root.right, val);
        if(res1 == res2){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args){
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);

        int val = root.data;
        boolean res = isUnivalued(root, val);
        System.out.println(res == true ? "YES" : "NO");

    }
}
