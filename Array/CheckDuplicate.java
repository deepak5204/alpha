package Array;

public class CheckDuplicate {

    

    //brute force method
    public static boolean hasDuplicate(int [] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    } 
    public static void main(String[] args){
        int [] nums = {1, 2, 3, 4};
        boolean res = hasDuplicate(nums);

        System.out.println(res);
    }
}
