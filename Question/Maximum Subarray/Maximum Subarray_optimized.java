// kadane's algorithm but written in better way
class Solution {
    public int maxSubArray(int[] nums) {
        int sum,max;
        sum=max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum = Math.max(nums[i],sum+nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}
// TC : O(N)
// SC : O(1)
