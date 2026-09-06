class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = nums[0];
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = i; j < n; j++){
                prod = prod * nums[j];
                maxprod = Math.max(maxprod,prod);
            }
        }
        return maxprod;
    }
}