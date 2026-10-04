class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            if(x!=y){
                int diff = Math.abs(y-x);
                pq.add(diff);
            }
        }
       if(pq.isEmpty())return 0;
       return pq.peek();
    }
}