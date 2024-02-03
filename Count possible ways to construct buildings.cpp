class Solution
{
    long mod=1000000007;
    public int TotalWays(int N)
    {
        long a=1;long b=1;long c=0;
        for(int i=1;i<=N;i++)
        {
            c=(a%mod+b%mod)%mod;
            a=b%mod;
            b=c%mod;
        }
        return (int)((c*c)%mod);
    }
}
