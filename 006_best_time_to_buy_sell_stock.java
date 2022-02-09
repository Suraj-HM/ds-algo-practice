class Solution1 {
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

class Solution2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int buy = 0;
        int sell = 1;
        int res = 0;
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                res = Math.max(prices[sell] - prices[buy], res);
                sell++;
            } else {
                buy = sell++;
            }
        }
        return res;
    }
}