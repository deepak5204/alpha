package Tries;

public class LongestWordWithAllPrefix {
    //create Node for Tries
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    //Insert function
    public static void insert(String word){ //O(n)
        Node curr = root;

        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }


    //Search function
    public static boolean search(String key){
        Node curr = root;

        for(int level = 0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i = 0; i < 26; i++){ //lexographically longest(alphabetically)
            // for(int i = 25; i >= 0; i--){ //not longest(alphabetically
            if(root.children[i] != null &&  root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); //backtrack step
            }
        }
    }
    public static void main(String[] args){
        String [] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("app"));

        longestWord(root, new StringBuilder());
        System.out.println(ans);

    }
}
