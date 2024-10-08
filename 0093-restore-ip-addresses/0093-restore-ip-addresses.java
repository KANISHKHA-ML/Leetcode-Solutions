class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> al=new ArrayList<>();
        List<String> res=new ArrayList<>();
        solve(s,al,res,0);
        return res;
    }
    public static void solve(String s, List<String> al, List<String> res, int start){
        if(start==s.length()){
        if(al.size()==4){
            String ans="";
            for(int i=0;i<4;i++){
                if(i==3) ans+=al.get(i);
                else{
                    ans+=al.get(i)+".";
                }
            }
            res.add(ans);
        }
        return;
        }
    for(int i=start;i<s.length();i++){
            if(isvalid(s.substring(start,i+1))){
                al.add(s.substring(start,i+1));
                solve(s,al,res,i+1);
                al.remove(al.size()-1);
            }
        }
    }
    public static boolean isvalid(String str){
        if(str.charAt(0)=='0' && str.length()>1) return false; 
        if(str.length()<=3){
        int val=Integer.parseInt(str);
        if(val>255) return false;
        }
        if(str.length()>3) return false;
        
        return true;
    }
}