class Solution {
    public int maxScore(String s) {
        int m0=0;
        int m1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') m1++;
        }
        int tot=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') m1--;
            else if(i!=s.length()-1) m0++;
            int sum=m1+m0;
            tot=Math.max(sum,tot);

        }
        return tot;

    }
}