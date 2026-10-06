class Solution {
    public int minAddToMakeValid(String s) {
        int opbrac = 0;
        int minreq = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                opbrac++;
            }
            else{
                if(opbrac <= 0){
                    minreq++;
                }
                else{
                    opbrac--;
                }
            }
        }
        return opbrac + minreq;
    }
}