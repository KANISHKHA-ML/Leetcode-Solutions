class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int i=m-1,j=0;
        int count=0;

       while(i>=0){

        if(j>=n) {i--;continue;}

        if(grid[i][j]<0){
            count+=(n-j);
            i--;
            j=0;
        }

        else{
            j++;
        }

       }
        return count;
    }
}