class Solution {
    public int countDigits(int num) {
        int c=0;
        int ori = num;
    //    Set<Integer> set = new HashSet<>();
        while(num>0){
            int d = num%10;
            //set.add(d);
            if(ori%d==0)c++;
            num = num/10;
        }
       /* for(Integer ele:set){
            if(ori%ele ==0)c++;
        }*/
        return c;
    }
}