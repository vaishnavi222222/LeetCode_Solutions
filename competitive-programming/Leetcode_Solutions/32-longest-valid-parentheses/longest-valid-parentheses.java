class Solution {
    public int longestValidParentheses(String s) {
        int ans =0;
        if(s.length() == 0) return 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') st.push(i);
            else if(s.charAt(i) == ')'){
                    st.pop();
                    if(st.isEmpty()) st.push(i);
                    else ans = Math.max(ans,i-st.peek());
            }
        }
        return ans;
    }
}