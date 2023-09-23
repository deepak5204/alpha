/*
  You are given an array prices where price[i] is the price of a given stock
  on the ith day. You want to maximize your profit by choosing a single day 
  to buy one stock and choosing a different day in the future to sell that
  stock. Return the maximum profit you can achieve from this transaction.
  If cannot achieve any profit, return 0.

  prices[] = {7, 1, 5, 3, 6, 4}

 */

package Array;
public class BuyandSellStocks {
    // calculate max profit in buying or selling ofstocks
    public static int profit(int[] price) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        if (price.length == 1) {
            return 0;
        } 
        // int c = 0;
        for (int i = 0; i < price.length; i++) {

            if (buyingPrice > price[i]) {
                buyingPrice = price[i];
                // c++;
                // if(c == price.length){
                //     return 0;
                // }
            } else {
                int profit = price[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
       return maxProfit;
    }

    public static void main(String[] args) {
        int[] preice = { 7, 4, 3, 1, 5};
       int res = profit(preice);
       System.out.println("max profit :"+res);
    }
}
