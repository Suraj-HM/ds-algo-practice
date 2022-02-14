class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        if(target < nums[l]) return 0;
        int r = nums.length - 1;
        if(target > nums[r]) return nums.length;
        
        int mid = 0;
        
        while(r > l) {
            mid = l + (r - l) / 2;
            if(target == nums[mid]) return mid;
            else if(nums[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}