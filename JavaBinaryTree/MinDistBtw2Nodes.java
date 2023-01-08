package JavaBinaryTree;

public class MinDistBtw2Nodes {
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

    public static Node findLCA(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if(leftLCA == null){
            return rightLCA;
        } 
        if(rightLCA == null){
            return leftLCA;
        }

        return root;
    }

    //calculate distance from LCA to Node
    public static int LCAdist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = LCAdist(root.left, n);
        int rightDist = LCAdist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if(leftDist == -1){
            return rightDist + 1;
        } else{
            return leftDist + 1;
        }
        
    }

    //minimum distance between two nodes
    public static int minDist(Node root, int n1, int n2){
        Node lca = findLCA(root, n1, n2);
        int dist1 = LCAdist(lca, n1);
        int dist2 = LCAdist(lca, n2);

        return dist1 + dist2;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        int res = minDist(root, n1, n2);
        System.out.println(res);
    }
}
