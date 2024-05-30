class Solution {
     static int mod=1000000007;
    static int help(String a,String b,int i,int j,int dp[][]){
        if(j==b.length())return 1;
        if(i==a.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int x=0,y=0;
        if(a.charAt(i)==b.charAt(j))x = help(a,b,i+1,j+1,dp);
        y = help(a,b,i+1,j,dp);
        return dp[i][j] = (x+y)%mod;
    }
    public static int countWays(String s1, String s2) {
        // code here
        int dp[][] = new int[s1.length()][s2.length()];
        for(int temp[]:dp)Arrays.fill(temp,-1);
        return help(s1,s2,0,0,dp);
    }
}
