class Solution {
    public void setZeroes(int[][] matrix) {
        //base case
        if(matrix.length<1) return;
        
        //col0 variable to memorize to set 0th col to 0;
        int col0=1,m = matrix.length,n = matrix[0].length;
        
        //setting the 0th row and 0th col to 0 if encounter 0 cell value; 
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0) col0=0;
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0; matrix[0][j]=0;
                }
            }
        }
        
        // setting 0 if either 0th row and 0th col value is 0;
        for(int i=m-1; i>=0;i--){
            for(int j=n-1;j>=1;j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if(col0==0) matrix[i][0] = 0; //if it set then convert 0th col to 0;
        }
    }
}
// TC : O(2(N*M))
// SC : O(1)
