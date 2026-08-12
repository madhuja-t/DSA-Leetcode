class Solution {
    public int minBitFlips(int start, int goal) {
        if(start == goal)return 0;
        int temp = (start^goal);
        int c=0;
        while(temp>0){
            int t1 = (temp&1);
            
            if(t1 ==1)c++;
            temp = temp>>1;
        }
        return c;
    }
}