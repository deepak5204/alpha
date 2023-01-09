package JavaBinaryTree;
import java.util.*;

public class FindAllDuplicateSubtrees {
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

    public static String inorder(Node root){
        if(root == null){
            return "";
        }

        String str = "(";
        str += inorder(root.left);
        str += Integer.toString(root.data);
        str += inorder(root.right);
        str += ")";

        if(map.get(str) != null && map.get(str) == 1){
            System.out.print(root.data+" ");
        }

        if(map.containsKey(str)){
            map.put(str, map.get(str)+1);
        } else {
            map.put(str, 1);
        }

        return str; 
    } 

    public static void printAllDups(Node root){
        inorder(root);
    }

    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args){
        /*
                        1
                       / \
                      4   3
                     /   / \
                    3   4   3
                       /
                      3
        */
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        root.right.left.left = new Node(3);

        printAllDups(root);

    }
}
