package Hashing;
import java.util.*;

public class BottomViewOf_A_BinaryTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    static class Info{
        int hd;
        Node node;

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void postOrder(Node root, Queue<Info> q, int hd){
        if(root == null){
            return;
        }
        postOrder(root.left, q, hd-1);
        postOrder(root.right, q, hd+1);
        q.add(new Info(root, hd));
    }
    public static void bottomView(Node root){

        Queue<Info> q = new LinkedList<>();
        postOrder(root, q, 0);
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
       while(!q.isEmpty()){
        Info curr = q.remove();
        if(!map.containsKey(curr.hd)){
            map.put(curr.hd, curr.node);
            min = Math.min(min, curr.hd);
            max = Math.max(max, curr.hd);

        }
       }


       for(int i = min; i <= max; i++){
        System.out.print(map.get(i).data+" ");
       }

    } 
    public static void main(String[] args){
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);


        bottomView(root);

    }
}
