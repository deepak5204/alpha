package Recursion;

public class RemoveDuplicateInAString {
    static StringBuilder newStr = new StringBuilder();
    static boolean [] map = new boolean[26];

    public static void removeDuplicate(String s, int i){
        //base case
        if(i == s.length()){
            System.out.println(newStr);
            return;
        }

        char newChar = s.charAt(i);
        if(map[newChar - 'a'] == false){
            map[newChar - 'a'] = true;
            newStr = newStr.append(newChar);
            removeDuplicate(s, i+1);
        } else{
            removeDuplicate(s, i+1);
        }
        
        
    }
    public static void main(String[] args){
        String s = "apnacollege";
        removeDuplicate(s, 0);

    }
}
