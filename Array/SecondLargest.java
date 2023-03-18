package Array;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int lar = arr[0] > arr[1] ? arr[0] : arr[1];
        int slar = arr[0] < lar ? arr[0] : arr[1];
        int temp = 0;

        for(int i = 2; i < arr.length; i++){
            if(arr[i] > slar){
                if(arr[i] > lar){
                    temp = lar;
                    lar = arr[i];
                }
                slar = temp;
            }
        }

        System.out.println("2nd largest: "+ slar);

    }
}
