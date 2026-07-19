class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low=0,high = n-1;
      /*  while(low<high){
            int mid = low  + (high-low)/2;
            if(nums[mid] > nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[low];*/
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<= nums[mid]){// left is sorted 
                                        // pick smallest nums[low]
                                        // eliminate the left
                ans = Math.min(ans, nums[low]);
                low = mid+1;

            }else{
                                        // right is sorted
                                        // pick smallest = nums[mid]'
                                        // eleimate the right
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}