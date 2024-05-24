package String;

public class SubstringFunction {
    public static void printSubstring(String str, int si, int ei){
        for(int i = si; i < ei; i++){
            System.out.print(str.charAt(i));
        }
    }

    public static void printSubstring2(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.substring(i));
        }
    }
    public static void main(String[] args){
        String str = "Hello";
        // printSubstring(str, 0, 5);

        //here last index are not included
        // System.out.println(str.substring(0,5));
        printSubstring2(str);
    }
}
