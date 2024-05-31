package Recursion;

import java.util.Scanner;

public class KeypadCombination {

    static String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printPossibleCombination(String str, int idx, StringBuilder combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printPossibleCombination(str, idx + 1, combination.append(mapping.charAt(i)));
            combination.deleteCharAt(combination.toString().length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        printPossibleCombination(str, 0, new StringBuilder());
    }
}
