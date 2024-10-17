class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=Arrays.copyOf(nums,nums.length);
        Arrays.fill(nums,0);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=0){
                nums[k++]=arr[i];
            }
        }
        
    }
}