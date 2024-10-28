class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<String,Integer> hm=new HashMap<>();
        String fi=words[0];
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            hm.put(fi.charAt(i)+"",hm.getOrDefault(fi.charAt(i)+"",0)+1);
        }

        for(int k=1;k<words.length;k++){
            String s=words[k];
             HashMap<String,Integer> tm=new HashMap<>();
             for(int i=0;i<s.length();i++){
            tm.put(s.charAt(i)+"",tm.getOrDefault(s.charAt(i)+"",0)+1);
        }
        Iterator<String>iterator=hm.keySet().iterator();
        while(iterator.hasNext()){
            String ch=iterator.next();
            if(tm.containsKey(ch)){
                int val=Math.min(hm.get(ch),tm.get(ch));
                hm.put(ch,val);
            }
            else{
                iterator.remove();
            }
        }
        }
        for(String str: hm.keySet()){
            for(int i=0;i<hm.get(str);i++){
            al.add(str);
        }
        }
        return al;
    }
}