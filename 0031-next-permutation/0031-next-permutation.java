class Solution {
    public void nextPermutation(int[] nums) {

        if(nums.length==1){
            return;
        }
        if(nums.length==2){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
            return;
        }
        int idx=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
        
        if(idx!=-1){
        int idx2=idx+1;

        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]>nums[idx] && nums[i]<=nums[idx2]){
                idx2=i;
            }
        }
        int temp=nums[idx];
        nums[idx]=nums[idx2];
        nums[idx2]=temp;
        }

        reverse(nums,idx+1,nums.length-1);
    }
    public static void reverse(int nums[], int start, int end){
        while(start<end){
            
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
            
        start++;
        end--;
           
    }
    }
}