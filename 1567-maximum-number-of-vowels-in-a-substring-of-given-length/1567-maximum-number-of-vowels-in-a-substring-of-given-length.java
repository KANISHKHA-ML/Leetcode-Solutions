class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        
        String v="aeiou";
        for(int i=0;i<k;i++){
            if(v.contains(s.charAt(i)+"")) c++;
        }
        int max=c;
        for(int i=k;i<s.length();i++){
            if(v.contains(s.charAt(i-k)+"")) c--;
            if(v.contains(s.charAt(i)+"")) c++;
            max=Math.max(max,c);
        }
        return max;
    }
}