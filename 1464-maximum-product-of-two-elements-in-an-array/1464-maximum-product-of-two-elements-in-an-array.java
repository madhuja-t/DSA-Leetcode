class Solution {
    public int maxProduct(int[] nums) {
        int p=1;
        if(nums.length ==1)return p;
        PriorityQueue<Integer> mxpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            mxpq.add(ele);
        }
        int k = 2;
        while(!mxpq.isEmpty() && k-->0){
            int ele = mxpq.remove()-1;
            p*=ele;
        }
        return p;
    }
}