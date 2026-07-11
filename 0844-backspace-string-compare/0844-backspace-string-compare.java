class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
       // if(s.charAt(0) == '#' || t.charAt(0) == '#') return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '#'){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            if(ch != '#'){
                tt.push(ch);
            }else{
                if(!tt.isEmpty()){
                    tt.pop();
                }
            }
            }
        String s1 = "",t1 = "";
        while(!st.isEmpty()){
            s1+=st.pop();
        }
        while(!tt.isEmpty()){
            t1+= tt.pop();
                }
                        return s1.equals(t1);
    }
}