class Solution {
    public int[] twoSum(int[] nums, int target) {
 int nums1[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
        }
        Arrays.sort(nums1);
        int nums2[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            nums2[i]=nums[i];
        }
        
        int low=0;
        int high=nums.length-1;
        int arr[] = new int[2];
        while(low<high){
            if(nums1[low]+nums1[high]==target){
                if(nums1[low]==nums1[high]){
                arr[0]=Arrays.binarySearch(nums, nums1[low]);
                arr[1]=Arrays.binarySearch(nums2, nums1[high]);
                return arr;
                
                }
                else{
                arr[0]=Arrays.binarySearch(nums, nums1[low]);
                arr[1]=Arrays.binarySearch(nums, nums1[high]);
                return arr;
                }
            }
            else if(nums1[low]+nums1[high]<target)
                low++;
            else
                high--;
        }
    return arr;
}
}