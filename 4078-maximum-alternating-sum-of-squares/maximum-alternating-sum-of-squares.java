class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];
        }
        long answer = 0;

        Arrays.sort(nums);

        for(int i = 0; i < n/2; i++){
            answer = answer - nums[i];
        }

        for(int i =  n / 2; i < n; i++){
            answer  = answer + nums[i];
        }
        return answer;
    }
}