class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al=new ArrayList<>();
        int fi=0;
        perm(nums,al,fi);
        return al;
    }
    public static void perm(int[] ch, List<List<Integer>> al, int fi){
        if(ch.length==fi){
            print(ch,al);
            return;
        }
        for(int i=fi;i<ch.length;i++){
            swap(ch,fi,i);
            perm(ch,al,fi+1);
            swap(ch,fi,i);
        }
    }
    public static void swap(int[] ch,int i, int fi){
        int temp=ch[i];
        ch[i]=ch[fi];
         ch[fi]=temp;
    }
    public static void print(int[] ch, List<List<Integer>> al){
        ArrayList<Integer>res=new ArrayList<>();
        for(int key: ch){
            res.add(key);
        }
        al.add(res);
    }
}