class solution{
   int maxSubarraySum(int[] arr){

     int res = 0;
     int maxend = 0;

     for ( int i = 1;i < arr.length; i++){
         maxend = Math.max( maxend + arr[i] , maxend);
         res = Math.max( res , maxend)
    }
     return res;
   }


}
