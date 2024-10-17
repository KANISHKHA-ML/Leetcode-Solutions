import java.util.*;
class Solution {
    public int maximumSwap(int num) {
        if(num<=9) return num;
        char[] s=Integer.toString(num).toCharArray();
        char[] s2=Integer.toString(num).toCharArray();
        Arrays.sort(s2);
        int k=s.length-1;
        char[] s1=new char[s.length];
        for(char c: s2){
            s1[k--]=c;
        }
        char val=' ';
        char val1=' ';
        int idx=-1;
        for(int i=0;i<s.length;i++){
            if(s[i]!=s1[i]){
                 val1=s1[i];
                 val=s[i];
                 idx=i;
                break;

            }
        }
        if(idx!=-1){
            int j=idx;
        for(int i=idx;i<s.length;i++){
            if(s[i]==val1){
            j=i;
           
        }
        }
        
        s[idx]=val1;
        s[j]=val;
        }

        String res=new String(s);
        return Integer.parseInt(res);
    }
}