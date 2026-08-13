class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // Convert 0-based indices to 1-based
                return new int[] {left + 1, right + 1};
            } 
            else if (sum < target) {
                // Need a larger sum
                left++;
            } 
            else {
                // Need a smaller sum
                right--;
            }
        }
        return new int[] {};
    }
}