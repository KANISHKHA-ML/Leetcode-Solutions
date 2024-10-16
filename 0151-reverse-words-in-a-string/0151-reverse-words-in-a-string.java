class Solution {
    public String reverseWords(String s) {
       String str=s.trim();
       String[] res=str.split("\\s+");
       String ans="";
       for(int i=res.length-1;i>0;i--){
        ans+=res[i].trim()+" ";
       } 
       ans+=res[0];
       return ans;
    }
}