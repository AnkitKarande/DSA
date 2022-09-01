class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];// calculating the sum of subrray from i to j 
                max = Math.max(sum,max); // current sum is max then update max
            }
        }
        return max;
    }
}
// TC : O(N^2);
// SC : O(1);
