class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int n=nums.length;
        int a=0;
        int sum=0;
        while(c!=k && a<n){
            if(nums[a]==1){
                sum++;
                a++;
            }
            else{
                sum++;
                c++;
                a++;
            }
        }
        int max=sum;
        int i=0;
        int j=a;
        while(j<n){
            if(nums[j]==1){
                sum++;j++;
                max=Math.max(max,sum);
            }
            else{
                while(nums[i]==1){
                    i++;sum--;
                }
                i++;j++;
                 max=Math.max(max,sum);
            }
        }
        return max;
    }
}