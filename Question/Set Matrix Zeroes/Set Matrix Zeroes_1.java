class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Pair> list = new ArrayList<>(); // to store the indexes of the 0 value cell
        
        //linearly traversing and storing the index to list
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    list.add(new Pair(i,j));
                }
            }
        }
        
        //traversing in the list and marking row and col to 0;
        for(int p=0;p<list.size();p++){
            for(int row=0;row<matrix.length;row++){
                matrix[row][list.get(p).j] = 0;
            }
            for(int col=0;col<matrix[0].length;col++){
                matrix[list.get(p).i][col] = 0;
            }
        }
    }
}
// TC : O((N*M)+((N*M)*(N+M))
// SC : O(N*M)
