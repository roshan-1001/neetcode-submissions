class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        int currmax = 0;
        int curr;
        int n = grid.length;
        int m = grid[0].length;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(grid[i][j]==1){
                    
                    curr = fill(n,m,i,j,grid);
                    currmax = Math.max(currmax,curr);
                }
            }
        }
        return currmax;


    }
    public int fill(int n, int m, int r, int c, int[][] grid){
        if (r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
            grid[r][c] = 0;
            return 1+ fill(n,m,r+1,c,grid) + fill(n,m,r,c+1,grid) + fill(n,m,r-1,c,grid)+ fill(n,m,r,c-1,grid);
        }
        else{
            return 0;
        }
        
       
    }
}
