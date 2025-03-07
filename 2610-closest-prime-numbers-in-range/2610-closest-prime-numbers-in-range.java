class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime=new boolean[right+1];
        Arrays.fill(prime, true);
        prime[0]=prime[1]=false;

        for(int i=2;i*i<=right;i++){
           if(prime[i]){
            for(int j=i*i;j<=right;j+=i){
                prime[j]=false;
            }
           } 
        }

        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime[i]) list.add(i);
        }
        int num1=-1,num2=-1,min=Integer.MAX_VALUE;
       
        for(int i=1;i<list.size();i++){
            int diff=list.get(i)-list.get(i-1);
            if(diff<min){
                num1=list.get(i-1);
                num2=list.get(i);
                min=diff;
            }
        }
        return new int[]{num1,num2};
    }
}