class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
          if (n == 0 || n == 1)
            return n;
            
      int dp[] = new int[n+1];
            // base conditions
            dp[0] = 0;
            dp[1] = 1;
         
            // Fill in bottom-up manner using recursive
            // formula.
            for (int i=2; i<=n; i++)
              dp[i] = Math.max(dp[i/2] + dp[i/3] + dp[i/4], i);
         
            return dp[n];
    } 
}
