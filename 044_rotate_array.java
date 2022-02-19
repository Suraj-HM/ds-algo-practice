

// effecient
class Solution1 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, 0, nums.length - k - 1);
        rotate(nums, nums.length - k, nums.length - 1);
        rotate(nums, 0, nums.length - 1);
    }
    public void rotate(int[] nums, int i, int j) {
        int temp;
        while(i < j) {
            temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}


// bruteforce
class Solution2 {
    public void rotate(int[] nums, int k) {
        
        for(int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for(int j = nums.length - 2; j >= 0 ; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = temp;
        }
    }
    
}