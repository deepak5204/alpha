package Recursion;

import java.util.*;

public class FindFirstAndLastOccurance {

    
    static int firstOccur = -1;
    static int lastOccur = -1;

    public static void findOccurance(String str, int i, char key) {
        if (i == str.length()) {
            return;
        }

        if (str.charAt(i) == key && firstOccur == -1) {
            firstOccur = i;
        }

        if (str.charAt(i) == key) {
            lastOccur = i;
        }
        findOccurance(str, i+1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        sc.close();


        findOccurance(str, 0, ch);

        System.out.println(firstOccur + " " + lastOccur);
    }
}
