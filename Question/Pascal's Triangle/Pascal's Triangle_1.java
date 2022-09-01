class Solution {
    public List<List<Integer>> generate(int numRows) {
        //to store answer
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();//to store current row answer
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);//first & last element of every row is 1 only
                }else{
                    int sum = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);//getting prev row sum
                    list.add(sum);
                }
            }
            ans.add(list);//adding current row to answer
        }
        return ans;
    }
}
// TC : O(N^2)
// SC : O(N)
