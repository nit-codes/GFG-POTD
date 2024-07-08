class Solution {
    int minElemIdx(int[] nums){           // pivot index
        int n = nums.length;     
        int s = 0;
        int e = n-1;

        while(s < e){
            int mid = s+(e-s)/2;

            if(nums[mid] < nums[e]){
                e = mid;
            }
            else{
                s = mid+1;
            }
        }
        return s;                  // or return e , as s ==e 
    }

    int BinarySearch(int s , int e, int[] nums, int target){
        
        while(s <= e){
            int mid = s+(e-s)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        } 
            return -1;
    }


    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int s = minElemIdx(nums);
        int e = (n-1);

        if(target >= nums[s] && target <= nums[e]){

            return BinarySearch(s, e, nums, target);
        }
        
         s = 0;
         e = minElemIdx(nums)-1;

         return BinarySearch(s, e, nums, target); 
    }
}
