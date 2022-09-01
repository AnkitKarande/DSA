// kadane's algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
      
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; // adding the current element to sum
            if(sum>max) max = sum; // if the currnt sum is max then update max
            if(sum<0) sum=0; // if the sum is negative set sum to 0 - prev subarray can't max bacause sum is negative 
        }
        return max;
    }
}
// TC : O(N);
// SC : O(1);
