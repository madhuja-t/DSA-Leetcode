class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        for(int i = 0; i < logs.length; i++)
        {
            ans = ans + add(logs[i], ans);
        }
        return ans;
    }
    public int add(String s, int ans)
    {
        if(s.charAt(1) == '.'){
            if(ans == 0)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        else if(s.charAt(0) == '.'){
            return 0;
        }
        else
        {
            return 1;
        }
    }
}