class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int i =0;i<32;i++){
            int c=0;
                for(int j=0;j<nums.length;j++){
                    int ele = nums[j];
                    int rs = (ele>>i);
                   if((rs&1)==1)c++;
                }
                if(c%3!=0){
                    ans = ans |(1<<i);
                }
        }
       return ans;

    }
}