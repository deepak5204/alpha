package JavaBinarySearchTree;

public class Mirror_A_BST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node createMirrorOfBST(Node root){
        if(root == null){
            return root;
        }

        Node leftSubtree = createMirrorOfBST(root.left);
        Node rightSubtree = createMirrorOfBST(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
    }


    //print tree
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){

        /*
                        8
                       / \
                      5   10
                     / \    \
                    3    6   11
         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);


        /*
            MIRROR OF BST

                        8
                       / \
                      10  5
                     /   / \
                    11  6   3
         */

        preorder(root);
        System.out.println();
         root = createMirrorOfBST(root);
         preorder(root);

    }
}
