package BitManipulation;

public class ClearLastNbits {
    public static int clearNbits(int num, int n) {
        int bitMarks = -1 << n;
        return num & bitMarks;
    }
    public static void main(String[] args) {
        System.out.println(clearNbits(15, 2));
    }
}
