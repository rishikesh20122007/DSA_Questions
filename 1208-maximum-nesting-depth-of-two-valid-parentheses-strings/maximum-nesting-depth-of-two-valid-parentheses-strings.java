class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int answer[] = new int[n];
        int d = 0;
        for(int i = 0; i  < n; i++){
            if(seq.charAt(i) == '('){
                d++;
                answer[i] = d % 2;
            }
            else{
                answer[i] = d % 2;
                d--;
            }
        }
        return answer;
    }
}