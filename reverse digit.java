class Solution{
  public int reverseDigits(int n){
      int rev = 0;
      while (0<n){
           rem = n%10;
           rev = (rev*10)+rem;
            n = n/10;
      }
  }
  return rev;
}
