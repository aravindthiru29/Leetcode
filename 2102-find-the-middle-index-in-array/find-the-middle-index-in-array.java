class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot = 0;
        for(int  i : nums){
            tot += i;
        }
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            int right = tot - left - nums[i];
            if(right == left){
                return i;
            }
            left += nums[i];
        }
        return -1; 
    }
}