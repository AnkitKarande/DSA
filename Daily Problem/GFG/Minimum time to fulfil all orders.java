class Solution {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        
        int i=X.length-1;
        int j=Y.length-1;
        
        int row = 1,col = 1;//track for the row & col for cutts
        int ans = 0;
        
        while(i>=0 && j>=0){
            //taking the large value cost first to minimize final cost
            if(X[i]>Y[j]){
                ans+=X[i]*row;
                col++;
                i--;
            }else{
                ans+=Y[j]*col;
                row++;
                j--;
            }
        }
        
        //if any cut cost left in array
        while(i>=0){
            ans+=X[i]*row;
            col++;
            i--;
        }
        while(j>=0){
            ans+=Y[j]*col;
            row++;
            j--;
        }
        return ans;
    }
}
// TC : O(max(N,M));
// SC : O(1);
