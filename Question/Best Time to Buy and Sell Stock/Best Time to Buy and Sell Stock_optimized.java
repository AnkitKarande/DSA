class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0; 
        
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice = prices[i];// update the minPrice if we find minimum price stock value
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit = prices[i]-minPrice; // update maxProfit if we find maximum profit ; 
                //we are taking else if because if we update the min price at that time out profit for that stock is zero cause prices[i] & minPrices will be same;
            }
        }
        return maxProfit;
    }
}
// TC : O(N)
// SC : O(1)
