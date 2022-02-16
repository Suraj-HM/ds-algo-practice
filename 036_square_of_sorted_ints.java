class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1, counter = nums.length - 1;
        int lRes, rRes;
        
        int[] res = new int[nums.length];
        
        while(l <= r) {
            lRes = nums[l] * nums[l];
            rRes = nums[r] * nums[r];
            if(lRes > rRes) {
                res[counter--] = lRes;
                l++;
            } else {
                res[counter--] = rRes;
                r--;
            }
        }
        return res;
    }
}