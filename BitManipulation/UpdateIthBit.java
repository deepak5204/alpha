package BitManipulation;

public class UpdateIthBit {

    public static int updtateIthBit(int n, int pos, int newBit){

        //do 1's complement of bitMarks
        int bitMarks = ~(1 << pos);

        //clear the position bit
         n = n & bitMarks;

        //  update the bitmarks with  newBit
         bitMarks = newBit << pos;

        //  set bit in theposition
         return bitMarks | n;

    }
    public static void main(String[] args) {
        System.out.println(updtateIthBit(10, 2, 1));
    }
}
