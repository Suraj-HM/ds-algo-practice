class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums) {
            if(i == 0 || nums[i-1] != n) nums[i++] = n;
        }
        return i;
    }
}