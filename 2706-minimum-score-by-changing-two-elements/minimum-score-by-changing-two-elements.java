class Solution {
    public int minimizeSum(int[] nums) {  // TC -> O(n log n)
        int num = nums.length;
        //sort the arrays first
        Arrays.sort(nums);
        //now processing 
        return Math.min(
            Math.min(nums[num - 3] - nums[0] ,  nums[num - 2] - nums[1]) ,
            nums[num - 1] - nums[2]
        );
    }
}