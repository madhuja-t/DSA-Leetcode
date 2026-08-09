class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int bob =0;
        int alice =0;
        int idx =0;
        int[]ans = new int[nums.length];
        for(int i=0;i<nums.length;i= i+2){
             alice = nums[i];
            if(i<=nums.length-2){
                bob = nums[i+1];
            }
            if(idx <= nums.length-2){
            ans[idx]=bob;
            idx +=1;
            ans[idx] = alice;
            idx +=1;
            }
        }
        return ans;
    }
}