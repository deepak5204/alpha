/*
 * We have an absolute path for a file(Unix-Style), simplify it. 
 * Note that absolute path always begin with '/' (root directory), 
 * a dot in path represent current directory and double dot represents parent directory.
 * 
 * Sample Input: /apnacollege/
 * Sample Output: /apnacollege
 * 
 * Sample Input: /a/..
 * Sample Output: /
 */


 package JavaStack;

 import java.util.Stack;
 
 public class SimplyPath {
 
     public static String simplify(String A){
         Stack<String> s = new Stack<String>();
         String res = "";
         res += "/";
         int n = A.length();
 
         for(int i = 0; i < n; i++){
             String dir = "";
 
             while(i < n && A.charAt(i) == '/'){
                 i++;
             }
 
             while(i < n && A.charAt(i) != '/'){
                 dir += A.charAt(i);
                 i++;
             }
 
             if(dir.equals("..") == true){
                 if(s.isEmpty()){
                     s.pop();
                 }
             }
             else if(dir.equals(".") == true){
                 continue;
             }
             else if(dir.length() != 0){
                 s.push(dir);
             }
         }
 
         Stack<String> s2 = new Stack<String>();
         while(!s.isEmpty()){
             s2.push(s.pop());
         }
 
         while(!s2.isEmpty()){
             if(s2.size() != 1){
                 res += (s2.pop() + "/");
             }
             else {
                 res += s2.pop();
             }
         }
         return res;
     }
 
     public static void main(String[] args){
         String str = new String("/a/./b/../../c/");
         String res = simplify(str);
         System.out.println(res);
     }
 }
 
