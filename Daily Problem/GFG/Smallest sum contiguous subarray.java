// this problem is implementation of kadane's algo
class Solution
{
    static int smallestSumSubarray(int a[], int size){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            sum+=a[i];
            if(min>sum) min = sum; // if sum is minimum store it in min.
            if(sum>0) sum = 0;// if sum is positive we don't have to include this subarray
                             // because it can't contribute to minimum subarray cause it's positive;
        }
        return min;
    }
}
// TC : O(N)
// SC : O(1)
