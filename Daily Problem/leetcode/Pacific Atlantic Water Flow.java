class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        if(heights.length<1) return ans;
        int row = heights.length;
        int col = heights[0].length;
        
        boolean[][] pac = new boolean[row][col]; // for pacific ocean 
        boolean[][] atl = new boolean[row][col]; // for atlantic ocean
        
        //filling 0th row for pacific ocean & row-1th row for atlantic ocean  
        for(int i=0;i<col;i++){
            ocean(heights,pac,0,i,Integer.MIN_VALUE,row,col);
            ocean(heights,atl,row-1,i,Integer.MIN_VALUE,row,col);
        }
        
        //filling 0th col for pacific ocean & col-1th col for atlantic ocean
        for(int i=0;i<row;i++){
            ocean(heights,pac,i,0,Integer.MIN_VALUE,row,col);
            ocean(heights,atl,i,col-1,Integer.MIN_VALUE,row,col);
        }
        
        //checking if the cell's water can reach both the ocean or not
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(pac[i][j] && atl[i][j]){
                    List<Integer> list = new ArrayList<>();
                    list.add(i); list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
    static void ocean(int[][] heights,boolean[][] ocean,int i,int j,int prev,int row,int col){
        //base case if the cell is not out of bound and not visited
        if(i<0 || j<0 || i>row-1 || j>col-1 || ocean[i][j]){
            return;
        }
        // cell height is less than prev water can't flow
        if(heights[i][j]<prev) 
            return;
        //marking visited && water can flow
        ocean[i][j] = true;
        
        ocean(heights,ocean,i-1,j,heights[i][j],row,col); //top
        ocean(heights,ocean,i,j-1,heights[i][j],row,col); //left
        ocean(heights,ocean,i+1,j,heights[i][j],row,col); //down
        ocean(heights,ocean,i,j+1,heights[i][j],row,col); //right
        
        return;
    }
}
