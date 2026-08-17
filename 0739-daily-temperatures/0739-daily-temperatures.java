class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] res= new int[l];     
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<l;i++){
            int ele = temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()] < ele){
                int idx= st.pop();
               
                res[idx] = i-idx;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.pop()] = 0;
        }
        return res;
    }
}