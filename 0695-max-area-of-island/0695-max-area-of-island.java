class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public static int dfs(int[][] grid,int r, int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        int co=1;
        grid[r][c]=0;
        co+=dfs(grid,r+1,c);//up
        co+=dfs(grid,r,c+1);//right
        co+=dfs(grid,r-1,c);//left
        co+=dfs(grid,r,c-1);//down
        return co;
    }
}
