class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int cur_sum = max_sum;
        for (int i = 1; i<nums.length; i+=1){
            cur_sum = Math.max(nums[i] + cur_sum, nums[i]);
            max_sum = Math.max(cur_sum, max_sum);       
         }
    return max_sum; 
    }
}