
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        int length = 1;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};

        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        q.offer( new int[]{0,0});
        visited[0][0] = true;

        while(!q.isEmpty()){
            int size = q.size();
            for(int j=0; j<size ;j++){
                int[] curr = q.poll();
                if (curr[0] == n-1 && curr[1]== m-1){
                    return length;
                }
                for(int[] dir : dirs){
                    int r = curr[0] + dir[0];
                    int c = curr[1] + dir[1];
                    if(r>=0 && r<n && c>=0 && c<m && visited[r][c]!=true && grid[r][c]==0){
                        q.offer(new int[]{r,c});
                        visited[r][c] = true;
                    }
                }
            }
            length++;
        }
        return -1;
    }
}