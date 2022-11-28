package BitManipulation;

public class ClearBitsInRange {

    public static int clearRangeBits(int num, int i, int j) {
        int bitMarks1 = ~(-1 << i);
        int a = num & bitMarks1;

        int bitMarks2 = -1 << j+1;
        int b = num & bitMarks2;

        return a | b;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeBits(255, 3, 5));
    }
}
