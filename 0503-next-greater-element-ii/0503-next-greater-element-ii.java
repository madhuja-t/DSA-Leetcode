class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        if(n==0) return new int[0];
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];

        int[] doubleArr = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            doubleArr[i] = doubleArr[i+n] = nums[i];
        }
        for(int i=2*n - 1; i>=0;i--){
            while(!st.isEmpty() && doubleArr[i]>= st.peek()){
                st.pop();
            }
            if(i < n){
                if(st.isEmpty()){
                    nge[i] = -1;
                }else{
                nge[i] = st.peek();
                }
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}