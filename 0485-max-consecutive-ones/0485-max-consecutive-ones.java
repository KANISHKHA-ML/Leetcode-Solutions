class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int c=0,m=0,n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]==1){
            c++;
        }
        else{
        c=0;
       } 
       m=Math.max(m,c);
       }
       return m;
    }
}