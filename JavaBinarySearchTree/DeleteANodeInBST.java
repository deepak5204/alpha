package JavaBinarySearchTree;

public class DeleteANodeInBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    //construct BST
    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        } else {
            root.right =insert(root.right, data);
        }
        return root;
    }

    //Inorder traversal in BST
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    //Delete a node from a BST
    /* 
        --> Case 1 - No child(Leaf Node)
            Delete Node & return Null to parent
        --> Case 2 - One child
            Delete Node & replace with child Node
        --> Case 3 - Two children
            Replace value with inorder successor
                Inorder successor in BST -> Left mostnode in RightSubtree
                    1 2 3 5 7 9
                    here inorder successor of 5 is 7
            Delete the node for inorder succesor

            (
                1. Find Inorder succesor
                2. Replace node(delete) value with Inorder successor 
                3. Delete Inorder successor value
            )

    */
    
    public static Node delete(Node root, int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        } else if(root.data < key){
            root.right = delete(root.right, key);
        } else { //voila 
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - single child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } 

            //case 3 - both children
            Node inordSucc = findInorderSuccessor(root.right);
            root.data = inordSucc.data;
            root.right = delete(root.right, inordSucc.data); 
        }
        return root;
    }


    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args){
        int values[] ={8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        int key = 5;
        root = delete(root, key);

        System.out.println();

        inorder(root);

    }
    
}
