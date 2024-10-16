class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        if(fb.length==1){
            if((fb[0]==0 && n==1)|| (fb[0]==1 && n==0) || fb[0]==0 && n==0) return true;
            return false;
        }
        for(int i=0;i<fb.length;i++){
            if(i==0){
                if(fb[0]==0 && fb[1]==0){
                    fb[0]=1;n--;
                }
            }
                else if(i==fb.length-1){
                    if(fb[fb.length-1]==0 && fb[fb.length-2]==0){
                        fb[fb.length-1]=1;
                        n--;
                    }
                }
                else{
                    if(fb[i]==0 && fb[i-1]==0 && fb[i+1]==0){
                        fb[i]=1;
                        n--;
                    }
                }
            
        }
        return(n<=0);
    }
}