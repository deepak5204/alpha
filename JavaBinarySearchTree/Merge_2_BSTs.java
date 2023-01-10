package JavaBinarySearchTree;

import java.util.ArrayList;

public class Merge_2_BSTs {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null; 
        }
    }

    //Inorder traversal
    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    //Create Balanced BST
    public static Node createBalancedBst(ArrayList<Integer> list, int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = si + (ei - si)/2;
        Node root = new Node(list.get(mid));
        root.left = createBalancedBst(list, si, mid-1);
        root.right = createBalancedBst(list, mid+1, ei);
        return root;
    }

    //Preorder Traversal
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
            BST1
                    2
                   / \
                  1    4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        /*
            BST2
                    9
                   /  \
                  3    12
         */

         Node root2 = new Node(9);
         root2.left = new Node(3);
         root2.right = new Node(12);


         ArrayList<Integer> list1 = new ArrayList<>();
         inorder(root1, list1);
     
         ArrayList<Integer> list2 = new ArrayList<>();
         inorder(root2, list2);

         ArrayList<Integer> finalList = new ArrayList<>();

         int i = 0, j = 0;
         while( i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            } else {
                finalList.add(list2.get(j));
                j++;
            }
         }

         while(i < list1.size()){
            finalList.add(list1.get(i));
            i++;
         }

         while(j < list2.size()){
            finalList.add(list2.get(j));
            j++;
         }

        Node root = createBalancedBst(finalList, 0, finalList.size()-1);
        preorder(root);
    }
    
}
