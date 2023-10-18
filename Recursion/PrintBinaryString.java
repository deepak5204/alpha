//Print all binary string of size n without consecutive 1


package Recursion;

public class PrintBinaryString {

    public static void binaryString(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // // if lastPlace is 0
        // if(lastPlace == 0){
        //     binaryString(n - 1, 0, str+"0");
        //     binaryString(n - 1, 1, str+"1");
        // } else {
        //     binaryString(n - 1, 0, str+"0");
        // }

        binaryString(n - 1, 0, str+"0");
        if(lastPlace == 0){
            binaryString(n - 1, 1, str+"1");
        }

    }
    public static void main(String[] args){
        int n = 4;
        binaryString(n, 0, "");

    }
}
