class Solution {
    public int maxSum(List<Integer> nums, int k) {
        final int modulo = 1000000007;
        int count[] = new int[30];

        for(int num : nums){
            for(int i = 0 ; i < 30; i++){
                if((num & ( 1 << i)) != 0){
                    count[i]++;
                }
            }
        }
        long answer = 0;
        for(int i = 0; i < k ; i++){
            long currentvalue = 0;
            for(int j = 29; j >= 0; j--){
                if(count[j] > 0){
                    currentvalue |= 1L << j;
                    count[j]--;
                }
            }
            answer = (answer + currentvalue * currentvalue) % modulo;
        }
        return (int)answer;
    }
}