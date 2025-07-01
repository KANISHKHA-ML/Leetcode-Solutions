class Solution {
    public int possibleStringCount(String word) {
        int res=1;
        if(word.length()==1) return 1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)==word.charAt(i)) res++;
        }
        return res;
    }
}