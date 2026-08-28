class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mxpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            mxpq.add(ele);
        }
        for(int i=0;i<k-1;i++){
            mxpq.remove();
        }
        return mxpq.peek();
    }
}