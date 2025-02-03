class Solution {
    public boolean isArraySpecial(int[] nums) {
        int p=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            if(p==0 && nums[i]%2==1){
                p=1;
            }
            else if(p==1 && nums[i]%2==0){
                p=0;
            }
            else return false;
        }
        return true;
    }
}