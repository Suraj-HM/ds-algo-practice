class Solution {
    // m -> len of array
    // n -> required amount
    public int coin_count(int S[], int m, int n) {
        // If n is 0 then there is 1 solution
        // (do not include any coin)
        if (n == 0)
            return 1;
        // If n is less than 0 then no
        // solution exists
        if (n < 0)
            return 0;
        // If there are no coins and n
        // is greater than 0, then no
        // solution exist
        if (m <= 0 && n >= 1)
            return 0;
        // count is sum of solutions (i)
        // including S[m-1] (ii) excluding S[m-1]
        return coin_count(S, m - 1, n) + coin_count(S, m, n - S[m - 1]);
    }
}