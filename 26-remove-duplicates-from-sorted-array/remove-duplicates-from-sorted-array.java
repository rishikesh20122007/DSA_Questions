class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int dublicateindex = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] !=nums[dublicateindex]){
                nums[++dublicateindex] = nums[i];
            }
        }
        return dublicateindex + 1;
    }
}