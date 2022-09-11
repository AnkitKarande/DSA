class Solution
{
    int count;
    public int findOccurrence(char mat[][], String target){
        int m = mat.length;
        int n = mat[0].length;
        char startingChar = target.charAt(0);
        count=0;//initializing count
        
        //traversing in the matrix calling solve function if we encounter starting char 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==startingChar)
                    solve(mat,m,n,target,i,j,0);
            }
        }
        return count;
    }
    public void solve(char mat[][],int m,int n,String target,int i,int j,int ind){
        //checking false condition
        if(i<0 || j<0 || i>=m || j>=n || ind>=target.length() || mat[i][j]!=target.charAt(ind)) 
            return;
        
        //if we reach at the end of target string then the word exist so increasing answer
        if(ind==target.length()-1)
            count++;
        
        //marking the visited position with space for next calls
        char store = mat[i][j];
        mat[i][j] = ' ';
            solve(mat,m,n,target,i-1,j,ind+1);//up
            solve(mat,m,n,target,i,j-1,ind+1);//left
            solve(mat,m,n,target,i+1,j,ind+1);//down
            solve(mat,m,n,target,i,j+1,ind+1);//right
            
        //putting original char back to matrix for next search
        mat[i][j] = store;
    }
}
// TC : O(M*N)
// SC : O(M*N)
