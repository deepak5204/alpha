package String;

public class Equals {
    public static void main(String[] args){
        String str = "hello"; // String literal
        String str2 = "hello"; // String literal
        String str3 = new String("hello"); // String object

        //here str1 & str2 share storage in common poool
        // i.e. same reference
        if(str  == str2){
            System.out.println("Both are equals");
        } else {
            System.out.println("Both are not equals");
        }

      
        //here str1 & str3 share storage in different poool
        // i.e. different reference
        if(str  == str3){
            System.out.println("Both are equals");
        } else {
            System.out.println("Both are not equals");
        }

        // == compare with reference not with value


        if(str.equals(str3)){
            System.out.println("Both are equals");
        } else {
            System.out.println("Both are not equals");
        }

        //.equals() compare with value


    }
}
