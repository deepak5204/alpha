package JavaBinaryTree;
import java.util.*;


public class BinaryTreeB {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode =new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }


        // preorder Traversal
        public void preorder(Node root){ //O(n)
            //base case   
            if(root == null){
                System.out.print("-1"+" ");
                return;
            }
            //recursion work
            System.out.print(root.data+" ");
            preorder(root.left); //function call
            preorder(root.right); //function call
        }


        //Inorder Traversal
        public void inorder(Node root){
            //base case
            if(root == null){
                return;
            }
            inorder(root.left); //function call
            System.out.print(root.data+" "); // work
            inorder(root.right); //function call
        }


        //Postorder Traversal 
        public void postorder(Node root){
            //base case
            if(root == null){
                return;
            }
            postorder(root.left); //function call
            postorder(root.right); //function call
            System.out.print(root.data+" "); //work
        }

        //LevelOrder Traversal
        public void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }


        //Height of Tree
        public int CalcHeight(Node root){
            if(root == null){
                return 0;
            }

            int lh = CalcHeight(root.left);
            int rh = CalcHeight(root.right);
            return Math.max(lh, rh) + 1;
        }


        //Count Nodes 
        public int countNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftcount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftcount + rightCount + 1;
        }

        // calculate sum of nodes
        public int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int lsum = sumOfNodes(root.left);
            int rsum = sumOfNodes(root.right);
            return lsum + rsum + root.data;
        } 
    }
    public static void main(String[] args){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelorder(root);
        // int ht = tree.CalcHeight(root);
        // System.out.println(ht);
        // System.out.println("Nodes = "+tree.countNodes(root));
        int sum = tree.sumOfNodes(root);
        System.out.println(sum);



    }
}
