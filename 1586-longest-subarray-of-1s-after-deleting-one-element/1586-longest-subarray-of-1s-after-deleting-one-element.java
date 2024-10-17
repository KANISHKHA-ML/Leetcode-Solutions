class Solution {
    public int longestSubarray(int[] nums) {
        int c=0;
        int n=nums.length;
        int sum=0;
        int a=0;
        // while(c!=2 && a<n){
        //     if(nums[a++]==1) sum++;
        //     else{
        //         c++;
        //         if(c==2){
        //             break;
        //         }
        //         else
        //          a++;
        //     }
           
        // }
        while (c < 2 && a < n) {
    if (nums[a] == 1) {
        sum++;
    } else {
        c++;
        if(c==2) break;
    }
    a++;
}

// Print the result
System.out.print(sum);
        System.out.print(sum);
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
                    sum--;i++;
                }
                i++;j++;
                 max=Math.max(max,sum);
            }
        }
        if(c==0){
            return nums.length-1;
        }
        return max;
    }
}