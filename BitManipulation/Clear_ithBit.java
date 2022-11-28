package BitManipulation;

public class Clear_ithBit {
    public static int cleartIthBit(int n, int pos) {
        int bitMarks = ~(1 << pos);

        return bitMarks & n;

    }
    public static void main(String[] args) {
        System.out.println(cleartIthBit(10, 3));
    }
}
