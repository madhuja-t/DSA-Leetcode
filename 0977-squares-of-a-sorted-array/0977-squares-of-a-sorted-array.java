class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i=0,j=n-1;
        int[] ans = new int[n];
        int k=n-1;
        while(i<=j){
            int si = nums[i]*nums[i];
            int sj = nums[j]*nums[j];
            if(si>sj){
                ans[k--] = si;
                i++;
            }else{
                ans[k--] = sj;
                j--;
            }
        }return ans;
    }
}