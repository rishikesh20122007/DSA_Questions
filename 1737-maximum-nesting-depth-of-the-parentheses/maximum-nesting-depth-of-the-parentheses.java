class Solution {
    public int maxDepth(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(c == '(') {
                stack.push(c);
            }
            else if ( c == ')'){
                stack.pop();
            }
            answer = Math.max(answer,stack.size());
        }
        return answer;
    }
}