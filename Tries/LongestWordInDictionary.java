package Tries;

public class LongestWordInDictionary {

    //create Node class for Tries
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

    //Insert function for Tries
    public static void insert(String word){
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
    public static boolean search(String str){
        Node curr = root;
        for(int level = 0; level < str.length(); level++){
            int idx = str.charAt(level) - 'a';
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

        for(int i = 0; i < 26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char) (i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); //backtrap step
            }
        }
    }
    public static void main(String[] args){
        String[] words = {"a","banana","app","appl","ap","apply","apple"};

        for(String str : words){
            insert(str);
        }

        System.out.println(search("worl"));
        longestWord(root, new StringBuilder());
        System.out.println(ans);

    }
    
}
