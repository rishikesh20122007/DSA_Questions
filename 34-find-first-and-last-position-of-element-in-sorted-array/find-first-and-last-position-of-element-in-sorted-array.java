class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums,target);
        int last = findlast(nums,target);

        return new int[]{first,last};
    }

    public int findfirst(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int result = -1 ;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                result = mid;
                end = mid - 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }

    public int findlast(int nums[], int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int result = -1 ;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                result = mid;
                start = mid + 1;
            }
            else if (nums[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }
}