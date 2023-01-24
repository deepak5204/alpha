package Tries;

import java.util.*;

public class GroupAnagramTogether {

    //create Node for tries
    static class Node {
        List<String> data;
        Node children[];
        boolean isEnd;

        public Node(){
            data = new ArrayList<>();
            children = new Node[26];
            isEnd = false;
        }
    }
    public static Node root;

    //Insert function
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


    static List<List<String>> ans;
    public static List<List<String>> groupAnagram(String[] words){
        ans = new ArrayList<>();
        root = new Node();

        //Enhanced for loop
        for(String word : words){
            build(word);
        }

        dfs(root);

        return ans;
    }


    //build function
    public static void build(String word){
        Node temp = root;
        char[] charArr = word.toCharArray();
        Arrays.sort(charArr);
        for(char ch : charArr){
            Node child = temp.children[ch - 'a'];
            if(child == null){
                temp.children[ch - 'a'] = new Node();
            }
            temp = temp.children[ch - 'a'];
        }
        temp.isEnd = true;
        temp.data.add(word);
    }


    public static void dfs(Node rt){
        if(rt.isEnd){
            ans.add(rt.data);
        }
        for(int i = 0; i < 26; i++){
            if(rt.children[i] != null){
                dfs(rt.children[i]);
            }
        }
    }

    public static void main(String[] args){
        String []   strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> res = groupAnagram(strs);

        System.out.println(res);

    }
}
