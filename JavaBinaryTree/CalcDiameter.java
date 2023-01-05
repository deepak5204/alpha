package JavaBinaryTree;

public class CalcDiameter {
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

    //calculate height
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }


    //calculate diameter   
    public static int diameter(Node root){  // O(n^2)
        if(root == null){
            return 0;
        }
        int ld = diameter(root.left);
        int lht = height(root.left);
        int rd = diameter(root.right);
        int rht = height(root.right);

        int selfDiam = lht + rht + 1;

        return Math.max(selfDiam, Math.max(ld, rd));
    }

    //information class
    static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    //2nd approach - calculate diameter
    public static Info diameter2(Node root){ // O(n)
        //base case
        if(root == null){
            return new Info(0,0);
        }
        Info  leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static void main(String[] args){
/*
            1
          /   \
         2     3
        / \    / \
       4   5  6   7
          /        \
         8          9
 */


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(9);
        

        int d = diameter(root);
        System.out.println("Diameter = "+ d);

        Info information = diameter2(root);
        System.out.println(information.diam);
        System.out.println(information.ht);
        
    }
}
