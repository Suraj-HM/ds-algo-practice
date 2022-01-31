class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int res = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min < prices[i]) {
                res = Math.max(res, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return res;
    }
}