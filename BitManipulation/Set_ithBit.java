package BitManipulation;

public class Set_ithBit {
    public static int setIthBit(int n,int pos) {
        int bitMarks = 1 << pos;

        return bitMarks | n;
    }
    public static void main(String[] args) {

        System.out.println(setIthBit(10, 2));
        
    }
}
