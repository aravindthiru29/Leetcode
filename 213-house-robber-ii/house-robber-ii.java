class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        return Math.max(
                helper(nums, 0, n-2),
                helper(nums, 1, n-1) 
        );
    }

    private int helper(int[] nums, int start, int end) {
        int[] memo = new int[nums.length+2];
        memo[end] = nums[end];
        for(int i = end-1; i >= start; i--){
            memo[i] = Math.max(nums[i] + memo[i+2], memo[i+1]);
        }
        return memo[start];
    }
}