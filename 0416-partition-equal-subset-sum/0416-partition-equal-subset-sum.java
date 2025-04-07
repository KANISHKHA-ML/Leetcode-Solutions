class Solution {
    public boolean canPartition(int[] nums) {
      int sum=0;
      int n = nums.length;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }
    
        sum = sum/2;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j] = -1;
            }
        }
        boolean res = ps(n,nums,sum,dp);
        return res;
        }
    
        public static boolean ps(int n, int ar[], int sum,int dp[][]){
        if(sum==0)
            return true;
        if(n<=0)
            return false;
        if(dp[n][sum]!= -1){
            if(dp[n][sum]==1){
                return true;
            }
            else{
                return false;
            }
        }
        if(ar[n-1]>sum){
            boolean ans = ps(n-1,ar,sum,dp);
            if(ans==true){
                dp[n][sum] = 1;
            }
            else{
                dp[n][sum] = 0;
            }
            return ans;
        }
        boolean pick = ps(n-1,ar,sum-ar[n-1],dp);
        boolean not_pick = ps(n-1,ar,sum,dp);
       boolean answer = (pick||not_pick);
       if(answer==true)
        dp[n][sum] = 1;
       else
        dp[n][sum] = 0;

    return answer;

       

        }
}