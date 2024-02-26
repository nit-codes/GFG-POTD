class Solution
{
     void help(String s,int index,List<String> ans,StringBuilder temp){
	    if(index==s.length()){
	        if(temp.length()!=0)ans.add(temp.toString());
	        return;
	    }
	    help(s,index+1,ans,temp);
	    temp.append(s.charAt(index));
	    help(s,index+1,ans,temp);
	    temp.deleteCharAt(temp.length()-1);
	}
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
	    help(s,0,ans,temp);
	    Collections.sort(ans);
	    return ans;
    }
}
