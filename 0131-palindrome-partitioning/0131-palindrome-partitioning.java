class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> al=new ArrayList<>();
        solve(s,al,res,0);
        return res;
    }

    public static void solve(String s, List<String> al, List<List<String>> res, int start){
        if(start==s.length()){
            res.add(new ArrayList<>(al));
           return;
        }
        for(int i=start;i<s.length();i++){
            if(ispalin(s.substring(start,i+1))){
                al.add(s.substring(start,i+1));
                solve(s,al,res,i+1);
                al.remove(al.size()-1);
            }
        }
    }
    public static boolean ispalin(String str){
        int ini=0;
        int lat=str.length()-1;
        while(ini<=lat){
            if(str.charAt(ini)!=str.charAt(lat)) return false;
            ini++;
            lat--;
        }
        return true;
    }
}