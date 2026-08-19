class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        int sum = 0;
        int count = 0;
        sumCount.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int remove = sum - k;
            if (sumCount.containsKey(remove)) {
                count += sumCount.get(remove);
            }
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }

        // Return the total count of subarrays
        return count;
    }
}