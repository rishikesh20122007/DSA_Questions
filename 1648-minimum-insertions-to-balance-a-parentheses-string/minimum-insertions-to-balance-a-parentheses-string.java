class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int lc =  0 , ins = 0, idx = 0;
        while(idx < n){
            char c = s.charAt(idx);
            if(c == '('){
                lc++;
                idx++;
            }
            else{
                if(lc > 0) lc--;
                else  ins++;

                if(idx < n - 1 && s.charAt(idx + 1) == ')'){
                    idx = idx + 2;
                }
                else{
                    ins++;
                    idx++;
                }
            }
        }
        ins = ins + lc * 2;
        return ins;
    }
}