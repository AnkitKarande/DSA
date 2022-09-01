class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=1;i<=rowIndex;i++){
            //we are calculating nCr in optimized way by using the prev nCr-1 value;
            long cur = ((long)ans.get(i-1)*((rowIndex-i)+1))/i;
            ans.add((int)cur);
        }
        return ans;
    }
}
//TC : O(n);
//SC : O(n);
