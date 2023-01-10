package JavaBinarySearchTree;

import java.util.ArrayList;

public class RootToLeafPath {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    //Construct Binary Searchtree
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


    //Print BST using Inorder
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }


    public static void printPath(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");
    }

    //print Root to leaf Node
    public static void printRoot2Leaf(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.data);
        if(root.left == null && root.right == null){
            printPath(list);
        }


        printRoot2Leaf(root.left, list);
        printRoot2Leaf(root.right, list);
        list.remove(list.size() - 1);
    }
        public static void main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}
