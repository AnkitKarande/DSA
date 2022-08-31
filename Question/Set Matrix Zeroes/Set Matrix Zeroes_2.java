// when the all matrix values are postive this approch is useful
class Solution {
    public void setZeroes(int[][] matrix) {
        
        //traversing in the matrix and for every 0 value cell mark it's row and col to -1 value;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    setMinus1(matrix,i,j);            
                }
            }
        }
        
        //traversing in the matrix and set 0 value for every -1 value;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    // function to set -1 for every 0 value cell's row and col
    void setMinus1(int[][] matrix,int row,int col){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]==0) continue;
            matrix[i][col] = -1;
        }
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[row][j]==0) continue;
            matrix[row][j] = -1;
        }
    }
}
// TC : O((N*M)*(N+M)+(N*M))
// SC : O(1)
