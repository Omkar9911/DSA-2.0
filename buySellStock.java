public class buySellStock {
    public int maxProfit(int[] prices) {

        int res=0;
        int minValue = prices[0];

        for(int i = 1; i < prices.length; i++ ){

            minValue = Math.min(minValue, prices[i]);
            res = Math.max(res, prices[i] - minValue);


        }
        return res;
    }
}
