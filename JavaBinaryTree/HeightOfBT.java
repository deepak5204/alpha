package JavaBinaryTree;
// import java.util.*;

public class HeightOfBT {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //height of Tree
    public static int calcHeight(Node root){
        if(root == null){
            return 0;
        }

        int lh = calcHeight(root.left);
        int rh= calcHeight(root.right);
        return Math.max(lh, rh) + 1;
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // q.add(null);

        // while(!q.isEmpty()){
        //     Node currNode = q.remove();
        //     if(currNode != null){
        //         System.out.print(currNode.data+" ");

        //         if(q.isEmpty()){
        //             break;
        //         } else{
        //             q.add(null);
        //         }
        //     } else{

        //     }
        // }
    }

        public static void main(String[] args){
           Node root = new Node(1);
           root.left = new Node(2);
           root.right = new Node(3);
           root.left.left = new Node(4);
           root.left.right = new Node(5);
           root.right.left = new Node(6);
           root.right.right = new Node(7);

           int ht = calcHeight(root);
           System.out.println(ht);
            
    
    }
    
}
