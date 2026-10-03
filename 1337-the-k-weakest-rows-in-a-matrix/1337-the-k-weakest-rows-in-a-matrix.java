class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
               
                if(a[1] != b[1])return a[1]-b[1];
                return a[0]-b[0];
        });
        for(int i=0;i<mat.length;i++){
           int count=0;
            for(int ele: mat[i]){
                if(ele == 1)count++;
            }
            pq.add(new int[]{i,count});
        }
        int idx=0;
        int[] ans = new int[k];
        while(k-- >0 && !pq.isEmpty()){
            int[] curr = pq.remove();
            ans[idx] = curr[0];
            idx++;

        }
        return ans;
    }
}