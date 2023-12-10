package JavaArrayList;
import java.util.*;

public class BeautifulArrayList {

    public static ArrayList<Integer> beautifulArrayList(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i = 2; i <= n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer e:ans) {
                if(2 * e <= n) temp.add(e * 2);
            }

            for(Integer e:ans) {
                if(2 * e - 2 <= n) temp.add(e * 2 - 1);
            }
            ans = temp;
        }
        return ans;
    }


    //divide and conquer approach
    public  static ArrayList<Integer> beautifulArrayList2(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }

    public static void divideConquer(int start, int increment, ArrayList<Integer> res, int n){
        if(start + increment > n){
            res.add(start);
            return;
        }
        divideConquer(start, 2 * increment, res, n);
        divideConquer(start + increment, 2 * increment, res, n);
    }
    public static void main(String[] args){

        int n = ;

        ArrayList<Integer> result = beautifulArrayList(n);

        System.out.println(result);

        System.out.println(beautifulArrayList2(n));

    }
}
