class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length+nums.length];
        int j=0,k=0;
        while(j<2){
            for(int i=0;i<nums.length;i++){
                arr[k++]=nums[i];
            }
            j++;
        }
        return arr;
    }
}