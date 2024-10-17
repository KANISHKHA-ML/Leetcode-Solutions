class Solution {
    public int compress(char[] chars) {
        int c=1;
        ArrayList<Character> al=new ArrayList<>();
        char num=chars[0];
        for(int i=1;i<chars.length;i++){
            if(num==chars[i]){
                c++;
            }
            else{
                if(c>1){
                    al.add(num);
                    if(c<=9){
                    al.add((char)('0'+c));
                    }
                    else{
                        rec(al,c);
                    }
                    c=1;
                    num=chars[i];
                }
                else{
                    al.add(num);
                    c=1;
                    num=chars[i];
                }
            }
        }
       
       if(c>1){
            al.add(num);
            if(c<=9){
            al.add((char)('0'+c));
            }
            else{
                rec(al,c);
            } 
       }

        else{
            al.add(num);
        }


        for(char ch : al){
            System.out.print(ch+" ");
        }

        int ans=al.size();
        for(int i=0;i<ans;i++){
            chars[i]=al.get(i);
        }
        return ans;
    }
    public static void rec(ArrayList<Character> al, int c){
        String t=Integer.toString(c);
        for(char te: t.toCharArray()){
            al.add(te);
        }
    }
}