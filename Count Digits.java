class Solution {
    static int evenlyDivides(int n) {
       int cnt = 0;
      int num = n;
      while(0<n){
        int rem = n%10;
        if(rem!=0){
          if(num%rem == 0){
            cnt++;
        }
        }
        n=n/10;
      }
      return cnt;
    }
}
