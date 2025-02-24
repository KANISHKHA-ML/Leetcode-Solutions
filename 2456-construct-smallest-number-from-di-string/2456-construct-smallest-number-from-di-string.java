class Solution {
    public String smallestNumber(String pattern) {
        String res="";
        String sb="";
        int n=pattern.length();
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                sb=Integer.toString(i+1)+sb;
                res+=sb;
                sb="";
            }
            else{
              sb=Integer.toString(i+1)+sb;  
            }
        }
        if(pattern.charAt(n-1)=='I'){
            sb+=(n+1); res+=sb; 
        }
        else{
            sb=Integer.toString(n+1)+sb;
            res+=sb;
        }
        return res;
    }
}