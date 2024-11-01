class Solution {
    public String makeFancyString(String s) {
        int count=1;
        StringBuilder sb=new StringBuilder(s.charAt(0)+"");
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch){
                if(count<2){
                    count++;
                    sb.append(ch);
                }
            }
            else{
                count=1;
                ch=s.charAt(i);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}