package JavaStack;
import java.util.Stack;

public class MaxRectangularAreaInHistogram {

    public static int maxArea(int[] height){
        int maxArea = 0;
        int[] nsr = new int[height.length];
        int[] nsl = new int[height.length];

        Stack<Integer> s = new Stack<>();
        
        //Next Smaller right
        for(int i = height.length - 1; i >= 0; i--){
        while(!s.empty() && height[s.peek()] >= height[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i] = height.length;
        } else {
            nsr[i] = s.peek();
        }
        s.push(i);
        }

        s = new Stack<>();
        // Next smaller left
        for(int i = 0; i < height.length; i++){
        while(!s.empty() && height[s.peek()] >= height[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i] = -1;
        } else {
            nsl[i] = s.peek();
        }
        s.push(i);
        }

        //Current Area: width - j-i-1 = nsr[i] - nsl[i]
        for(int i = 0; i < height.length; i++){
            int ht = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = ht * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[] height = {2, 4, 1, 5, 6, 2, 3};

        int result = maxArea(height);
        System.out.println();
        System.out.println("Maximum rectangular area in histogram is "+ result);
    }
}
