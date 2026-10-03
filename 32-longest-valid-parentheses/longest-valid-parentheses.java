class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxilength = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else {
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else {
                    maxilength = Math.max(maxilength, i - st.peek());
                }
            }
        }
        return maxilength;
    }
}