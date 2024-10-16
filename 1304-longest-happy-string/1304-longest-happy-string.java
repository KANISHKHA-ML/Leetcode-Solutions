class Solution {
    public String longestDiverseString(int a, int b, int c) {
        String str="";
        int curA=0,curB=0,curC=0;
        int n=a+b+c;
        for(int i=0;i<n;i++){
            if(a>=b && a>=c && curA!=2 || (a>0 &&(curC==2 || curB==2))){
                str+="a";
                curA++;
                a--;
                curB=0;
                curC=0;
            }
            else if(b>=a && b>=c && curB!=2 || (b>0 &&(curA==2 || curC==2))){
                str+="b";
                curB++;
                b--;
                curA=0;
                curC=0;
            }
            else if(c>=a && c>=b && curC!=2 || (c>0 &&(curA==2 || curB==2))){
                str+="c";
                curC++;
                c--;
                curA=0;
                curB=0;
            }
        }
        return str;
    }
}