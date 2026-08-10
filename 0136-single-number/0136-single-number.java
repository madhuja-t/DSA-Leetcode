class Solution {
    public int singleNumber(int[] nums) {
       /*HashMap<Integer,Integer> map = new HashMap<>();
        int single = -1;
        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() ==1){
                single = e.getKey();
            }
        }
        return single; 
                            
        */
      /*  int xor =0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;*/
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int ele : nums){
                int rightShift = (ele>>i);
                if((rightShift&1)==1)count++;
            }
            if(count%2 !=0){
            ans = ans|(1<<i);
            }
        }
        return ans;
    }
}