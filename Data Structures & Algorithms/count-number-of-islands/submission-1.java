class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(grid[i][j]=='1'){
                    fill(n,m,i,j,grid);
                    count+=1;
                }
            }
        }
        return count;


    }
    public void fill(int n, int m, int r, int c, char[][] grid){
        if (r>=0 && r<n && c>=0 && c<m && grid[r][c]=='1'){
            grid[r][c] = '0';
        }
        else{
            return;
        }
        fill(n,m,r+1,c,grid);
        fill(n,m,r-1,c,grid);
        fill(n,m,r,c-1,grid);
        fill(n,m,r,c+1,grid);
        return;
    }
}
