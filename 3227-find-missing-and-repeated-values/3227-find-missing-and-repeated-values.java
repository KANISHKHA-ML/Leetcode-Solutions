class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set=new HashSet<>();
        int n=grid.length;
        int[]res=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.add(grid[i][j])) res[0]=grid[i][j];
            }
        }
        for(int i: set){
            System.out.print(i+" ");
        }
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.contains(k++)){
                    res[1]=--k;
                }
            }
        }
        return res;
    }
}