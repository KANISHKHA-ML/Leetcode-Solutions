class Solution {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long l=0;
        long r=0;
        for(int i=0;i<nums.length;i++){
            r+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            l+=nums[i];
            r-=nums[i];
            System.out.println(l+" "+r);
            if(l>=r) c++;
        }
        return c;
    }
}