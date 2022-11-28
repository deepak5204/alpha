package BitManipulation;

public class Get_ithBit {

    public static int getIthbit(int n, int pos){
        int bitMarks = 1<<pos;
        // bitMarks = 1 << pos;
        System.out.println(bitMarks);
        if((bitMarks & n) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthbit(10, 3));
    }
}
