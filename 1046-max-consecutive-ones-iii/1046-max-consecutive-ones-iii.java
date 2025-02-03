class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
         int t=k,c=0,m=0,a=0;
        while(t>0 && a<n){
            if(arr[a]==0){
                t--;
        }
        c++;a++;
    }
    m=c;
    int i=a,f=0;
    while(i<n){
        if(arr[i]==1){
            c++;i++;
            m=Math.max(m,c);
        }
        else{
            if(arr[f]==0){
                i++;
            }
            else{
                c--;
            }
            f++;
        }
    }
    return m;
    }
}

