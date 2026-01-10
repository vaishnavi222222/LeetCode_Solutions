class Solution {
    int max =0;
    public int dfs(int[] node,boolean[][] vist,int[][] grid) {
        int i=node[0];
        int cnt =1;
        int j=node[1];
        vist[i][j] = true;
        int[][] child ={{i+1, j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k=0;k<4;k++){
            int ci = child[k][0];
            int cj = child[k][1];
            if(ci >= 0 && ci<grid.length && cj >= 0 && cj <grid[0].length && grid[ci][cj] == 1){
                if(!vist[ci][cj]){
                    
                    cnt += dfs(new int[]{ci,cj},vist,grid);
                }
            }
        }
        return cnt;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                     max = Math.max(dfs(new int[]{i,j},visited,grid),max);
                }
            }
        }
        return max;
    }
}