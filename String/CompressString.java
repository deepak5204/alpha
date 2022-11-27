package String;

public class CompressString {
    public static String compress(String str) {
        StringBuilder compStr = new StringBuilder("");
        
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count += 1;
                i++;
            }

            compStr.append(str.charAt(i));
            if(count > 1){
                compStr.append(count.toString());
            }
        }
        return compStr.toString();
    }
    public static void main(String[] args){
        String str = "aaaabbbbccccdddee";

        String res = compress(str);
        System.out.println(res);
    }
}
