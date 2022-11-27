package String;

public class ConvertLowerCaseToUppercase {

    public static String toUpperCase(String str){
        StringBuilder newStr = new StringBuilder();
        
         char ch = Character.toUpperCase(str.charAt(0));
         newStr.append(ch);

         for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                newStr.append(str.charAt(i));
                // newStr.append(str.charAt(i));
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                newStr.append(str.charAt(i));
            }
         }
         return newStr.toString();
    }
    public static void main(String[]args){
        String str = "hi i am deepak";
        String newStr = toUpperCase(str);
        System.out.println(newStr);
    } 
}
