class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m] ==target) return m;
            //check for sortes partition 
            //if left is sorted
            if(nums[l] <= nums[m]){       //either half is sorted
                if(nums[l] <= target && target <= nums[m]){
                    h = m-1;// eliminate right half if it is present
                }else{
                    l=m+1; // else eliminate left half and check in right
                }
            }
            else{          // else right is sorted
                    if(nums[m] <= target && target <= nums[h]){
                        l =m+1;
                    }else{
                        h = m-1;
                    }
            }
        }
        return -1;
    }
}