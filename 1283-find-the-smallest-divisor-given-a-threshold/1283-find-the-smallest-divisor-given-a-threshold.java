class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = -1;
        for(int ele: nums){
            high= Math.max(high,ele);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int Threshold = threshold(nums,mid);
            if(Threshold <= t){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int threshold(int[] nums, int divisor){
        int sum=0;
        for(int ele: nums){
            sum+= (int)Math.ceil((double)ele/divisor);
        }
        return sum;
    }
}