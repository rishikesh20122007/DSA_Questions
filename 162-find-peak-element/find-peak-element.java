class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 2;
        int ans = n - 1;
        while(start <= end){
            int mid = start + (end - start)/ 2;
            if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        
        }
        return ans;
    }
}