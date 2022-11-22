package Array;

public class BuyandSellStocks {

    // calculate max profit in buying or selling ofstocks
    public static int profit(int[] price) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        if (price.length == 1) {
            return 0;
        } 
        int c = 0;
        for (int i = 0; i < price.length; i++) {

            if (buyingPrice > price[i]) {
                buyingPrice = price[i];
                c++;
                if(c == price.length){
                    return 0;
                }
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
