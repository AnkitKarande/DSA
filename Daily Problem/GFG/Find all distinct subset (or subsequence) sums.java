class Solution
{

    public int[] DistinctSum(int[] nums){
        // Code here
        Set<Integer> set = new HashSet<>();
        boolean[][] dp = new boolean[101][10001];
        solve(nums,0,0,nums.length,set,dp);
        int[] ans = new int[set.size()];
        int j=0;
        for(int i:set){
            ans[j++] = i;
        }
        Arrays.sort(ans);
        return ans;
    }
    void solve(int[] nums,int index,int sum,int n,Set<Integer> set,boolean[][] dp){
        if(index==n){
            set.add(sum);
            return;
        }
        if(dp[index][sum]) return;
        dp[index][sum] = true;
        solve(nums,index+1,sum,n,set,dp);
        solve(nums,index+1,sum+nums[index],n,set,dp);
    }
}
