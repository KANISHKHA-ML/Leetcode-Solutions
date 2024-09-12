class Solution {
    public int largestRectangleArea(int[] hist) {
        int n=hist.length;
       Stack<Integer> st=new Stack<>();
       int arr1[]=new int[n]; 
       int arr2[]=new int[n];
       // Left 
       st.push(0);arr1[0]=0;
       for(int i=1;i<n;i++){
        while(true){
            if(hist[i]>hist[st.peek()]){
                arr1[i]=st.peek()+1;
                st.push(i);
                break;
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                    arr1[i]=0;
                    break;
                }
            }
        }
       }

       // Right
        st.clear();
       st.push(n-1);
       arr2[n-1]=n-1;
       for(int i=n-2;i>=0;i--){
        while(true){
            if(hist[i]>hist[st.peek()]){
                arr2[i]=st.peek()-1;
                st.push(i);
                break;
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                    arr2[i]=n-1;
                    break;
                }
            }
        }
       }
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
          for(int i:arr2){
            System.out.print(i+" ");
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,((arr2[i]-arr1[i]+1)*hist[i]));
            System.out.print(maxi+" ");
        }
        return maxi;
    }
}