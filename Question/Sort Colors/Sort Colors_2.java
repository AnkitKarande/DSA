//We are using count sort for this question
class Solution {
    public void sortColors(int[] nums) {
        //declaring variable to store each color count
        int red = 0,white = 0,blue = 0;
        
        //counting frequency
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) red++;
            if(nums[i]==1) white++;
            if(nums[i]==2) blue++;
        }
        
        //fillng the array
        int index = 0;
        while(red-->0){
            nums[index++]=0;
        }
        while(white-->0){
            nums[index++]=1;
        }
        while(blue-->0){
            nums[index++]=2;
        }
    }
}
// TC : O(2N);
// SC : O(1);
