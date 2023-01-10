package JavaBinarySearchTree;

import java.util.ArrayList;

public class ConvertBST_to_BalancedBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    //Find sorted list
    public static void findSortedList(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        findSortedList(root.left, list);
        list.add(root.data);
        findSortedList(root.right, list);
    }


    //create a balanced BST
    public static Node createBalancedBST(ArrayList<Integer> list, int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = si + (ei - si)/2;
        Node root = new Node(list.get(mid));
       root.left = createBalancedBST(list, si, mid-1);
        root.right = createBalancedBST(list, mid+1, ei);
        return root;
    }

    //print BST
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args){
        /*
                            8
                           / \
                          6   10
                         /      \
                        5        11
                       /           \
                      3             12
         */

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        /*
            EXPECTED BST
                        8
                       /  \
                      5    11
                     / \   / \ 
                    3   6 10  12
         */ 

         ArrayList<Integer> list = new ArrayList<>();
          findSortedList(root, list);

          root = createBalancedBST(list, 0, list.size()-1);

          preorder(root);
    }
}
