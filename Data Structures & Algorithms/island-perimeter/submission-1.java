class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int res = 0;

        int l = grid.length;
        int m = grid[0].length;

        for(int i=0; i<l; i++){
            for(int j=0; j<m; j++){
                res += 4 - check(i,j,grid);
            }
        }

        return res;
    }

    private int check(int i, int j, int[][] grid){
        if (grid[i][j] == 0){
            return 4;
        }
        int curr = 0;
        if(i>0 && grid[i-1][j]==1){
            curr += 2;
        }
        if(j>0 && grid[i][j-1]==1){
            curr += 2;
        }

        return curr;
        
    }
}