class Solution {
    public int minimizeSum(int[] nums) {  // TC -> O(n log n)
        int num = nums.length;
        //sort the arrays first
        Arrays.sort(nums);
        //now processing 
        int a = nums[num - 3] - nums[0];
        int b = nums[num - 2] - nums[1];
        int c = nums[num - 1] - nums[2];

        return Math.min(a ,Math.min( b , c ));
    }
}