package Tries;

public class StartsWithProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();


    //create tries
    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
    }

    //check any string in Tries starts with prefix
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int level = 0; level < prefix.length(); level++){
            int idx = prefix.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    } 

    public static void main(String[] args){
        String[] words = {"apple", "app", "mango", "man", "woman"};

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        String prefix1 = "app";
        System.out.println(startsWith(prefix1));
        String prefix2 = "mg";
        System.out.println(startsWith(prefix2));
    }
}
