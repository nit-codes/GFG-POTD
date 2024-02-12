class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        res.add(0);
        for(int i=1;i<n;i++){
            int x=res.get(i-1)-i;
            if(x>0 && !set.contains(x)){
                res.add(x);
                set.add(x);
            }
            else{
                res.add(res.get(i-1)+i);
                set.add(res.get(i-1)+i);
            }
        }
        return res;
    }
}
