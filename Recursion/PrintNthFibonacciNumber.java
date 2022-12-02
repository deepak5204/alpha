package Recursion;

import java.util.Scanner;

public class PrintNthFibonacciNumber {
    public static int nthFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int nm1 = nthFibonacci(n - 1);
        int nm2 = nthFibonacci(n - 2);
        return nm1 + nm2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = nthFibonacci(n);
        System.out.println(res);
    }
}
