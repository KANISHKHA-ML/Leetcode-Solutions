class Solution {
    public String reverseWords(String s) {
       String str=s.trim();
       String[] res=str.split(" ");
       String ans="";
       for(int i=res.length-1;i>0;i--){
        if(!(res[i].isEmpty()))
        ans+=res[i].trim()+" ";
       } 
       ans+=res[0];
       return ans;
    }
}