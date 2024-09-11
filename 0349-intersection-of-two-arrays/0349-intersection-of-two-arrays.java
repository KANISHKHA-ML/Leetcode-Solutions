class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int i=0,j=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            s.add(nums1[i]);i++;j++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            i++;
        }
       }
       int res[]=new int[s.size()];
       int a=0;
       for(int k:s){
        res[a++]=k;
       }
       return res;

    }
}