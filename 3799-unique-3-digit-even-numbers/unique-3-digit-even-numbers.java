class Solution {
    public int totalNumbers(int[] digits) {
        int m = digits.length;
        boolean[] num = new boolean[1000];
        int answer = 0;

        for(int i = 0; i < m; i++){
            if(digits[i]== 0) {
                continue;
            }
            for(int j = 0; j < m; j++){
                if(i == j){
                    continue;
                }
                for(int k = 0; k < m; k++){
                    if(digits[k] % 2 !=0 || k == i || k == j){
                        continue;
                    }
                    int x = 100 * digits[i] + 10 * digits[j] + digits[k];
                    if(!num[x]){
                        num[x] = true;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}