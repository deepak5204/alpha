package GreedyAlgorithm;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices, int n){
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if(prices[i]-buy > profit){
                profit = prices[i]- buy;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 6, 4};
        int n = prices.length;

        int res = maxProfit(prices, n);
        System.out.println("Maximum profit = "+res);
    }
}
