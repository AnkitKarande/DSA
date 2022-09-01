// in this approach we will take two pointer low & high;
// low will point to 0(start) and high will point to 2(end)
// and we take mid to traverse to array if we encounter 0 in array
// we will swap with low and if we encounter 2 in array
// we will swap with high and for 1 we will just increment mid;

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
// TC : O(N);
// SC : O(1);
