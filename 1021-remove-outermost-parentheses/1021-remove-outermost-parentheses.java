class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
       String ans = "";
       int balance=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if(ch == '('){
                if(balance >0){
                    ans = ans+ch;
                }
                balance++;
           }else{
                balance--;
                if(balance >0){
                    ans = ans+ch;
                }
           }
        }
        return ans;
    }
    
}