package JavaBinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
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

    //get path
    public static boolean getPath(Node root, int n, ArrayList<Node> list){
        if(root == null){
            return false;
        }

            list.add(root);
        if(root.data == n){
            list.add(root);
            return true;
        }

        boolean foundLeft = getPath(root.left, n, list);
        boolean foundRight = getPath(root.right, n, list);

        if(foundLeft || foundRight){
            return true;
        }

        list.remove(list.size() - 1);
        return false;
    }

    public static Node LCA(Node root, int n1, int n2){  // TC- O(n)
                                                        //SC - O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common Ancestor
        int i = 0;
        for(; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        return path1.get(i - 1);
    }


    //LCA 2

    public static Node LCA2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node LeftLca = LCA2(root.left, n1, n2);
        Node rightLca = LCA2(root.right, n1, n2);

        if(rightLca == null){
            return LeftLca;
        }
        if(LeftLca == null){
            return rightLca;
        }

        return root;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.err.println(LCA(root, 4, 5).data);

        
    }
}
