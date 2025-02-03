class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int si=1,sd=1,it=1,dt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                it++;
                dt=1;
            }
            else if(nums[i]<nums[i-1]){
                dt++;
                it=1;
            }
            else{
                it=1;dt=1;
            }
            si=Math.max(si,it);
            sd=Math.max(sd,dt);
        }
        return Math.max(si,sd);
    }
}