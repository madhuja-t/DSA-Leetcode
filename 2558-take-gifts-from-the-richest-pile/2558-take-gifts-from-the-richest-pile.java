class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> mxpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : gifts){
            mxpq.add(ele);
        }
        while(k-->0 && !mxpq.isEmpty()){
            int ele = mxpq.remove();
            int sqrt = (int)Math.sqrt(ele);
            mxpq.add(sqrt);
        }
        long sum=0;
        while(!mxpq.isEmpty()){
            sum+= mxpq.remove();
        }
        return sum;
    }
}