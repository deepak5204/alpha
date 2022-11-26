package String;

public class StringBuilderUse {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("");

         for(char ch = 'a';ch <= 'z'; ch++){
            str.append(ch);
         }
         System.out.println(str);

         /*
            int a = 10;
            a.toString();

            here cannot use toString() method
         */

         /*
         Integer a = 10;
         a.toString();
          
         here we can use toString() method because Here Integer is a class
          */

    }
}
