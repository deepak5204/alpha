package JavaArrayList;
import java.util.ArrayList;

public class PairSumInSortedAndRotatedList {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int n = list.size();
        int breakingPoint = -1;
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)){
                breakingPoint = i;
            }
        }

        int lp = breakingPoint + 1; //smallest
        int rp = breakingPoint; //largest

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            } 
            //case 2
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }
            //case 3
            else{
                rp = (n+rp-1) % n;
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // 7, 8, 3, 4, 5, 6
        list.add(7);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum(list, 11));
    }
}
