class Solution {
    public int maximumProduct(int[] nums) {
        int tMax = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            tMax = Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
        }
        return tMax;
    }
}