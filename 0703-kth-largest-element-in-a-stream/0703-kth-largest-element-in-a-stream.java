class KthLargest {
   private PriorityQueue<Integer> mnpq;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        mnpq = new PriorityQueue<>();
        for(int ele: nums){
            mnpq.add(ele);
            if(mnpq.size()>k)mnpq.remove();
        }
    }
    
    public int add(int val) {
        mnpq.add(val);
        if(mnpq.size()>k)mnpq.remove();
        return mnpq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */