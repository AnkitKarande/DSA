class Solution {
    public int maxProfit(int[] prices) {
        int max=0; //max profit
        
        //outer loop for buy stock
        for(int i=0;i<prices.length-1;i++){
            //inner loop for to choose sell stock with max profit
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i] && prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];// update max if profit is max;
                }
            }
        }
        return max;
    }
}
// TC : O(N^2)
// SC : O(1)
