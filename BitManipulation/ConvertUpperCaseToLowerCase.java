package BitManipulation;

public class ConvertUpperCaseToLowerCase {
    public static void main(String[] args) {
        
        //convert upper case letter to lower case letter
        for(char ch = 'A'; ch < 'Z'; ch++){
            System.out.print((char)(ch | ' '));
        }

    }
}
