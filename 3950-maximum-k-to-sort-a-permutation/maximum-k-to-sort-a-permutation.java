class Solution {
    public int sortPermutation(int[] nums) {
        int m = nums.length;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            if(nums[i] == i){
                continue;
            }
            answer = answer & nums[i];
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}