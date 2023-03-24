package String;
import java.util.Scanner;
public class CountFrequencyOfLetterInString {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String what you want: ");
        String s = sc.nextLine();
        sc.close();

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                freq[s.charAt(i) - 'a'] += 1 ;
            }
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                System.out.println((char)('a'+i) + " = " + freq[i]);
            }
        }

    }
}
