package Tries;

public class FindAllUniqueSubstring {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();


    //create tries
    public static void insert(String str){
        Node curr = root;
        for(int i = 0; i < str.length(); i++){
            int idx = str.charAt(i) - 'a';

            if(curr.children[i] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    
    //count unique Substring
    public static int countSubstring(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null){
                count += countSubstring(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args){
        String str = "ababa";
        for(int i = 0; i < str.length(); i++){
            String subStr = str.substring(i);
            insert(subStr);
        }

        System.out.println(root);
    }
}
