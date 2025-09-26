class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int n = arr.length;
        int flips = 0;
        int flipped = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            if(!queue.isEmpty() && queue.peek()==i)
            {
                queue.poll();
                flipped ^= 1;
            }
            if((arr[i]^flipped)==0){
                if(i+k>n)
                    return -1;
                flips++;
                queue.add(i+k);
                flipped ^= 1;
            }
        }
        return flips;
    }
}
