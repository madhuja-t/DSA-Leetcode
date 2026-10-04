class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            int x1 = a[0];
            int y1 = a[1];
            int x2 = b[0];
            int y2 = b[1];
            int d1 = x1*x1+y1*y1;
            int d2 = x2*x2+y2*y2;
            if(d1 != d2 )return d1-d2;
            if(d1 == d2 && x1 != x2)return x1-x2;
            return y1-y2;
        });
        for(int[] row : points){
            pq.add(row);
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(!pq.isEmpty() && k-->0){
            int[] curr = pq.remove();
            ans[i][0] = curr[0];
            ans[i][1] = curr[1];
            i++;
        }
        return ans;
    }
}