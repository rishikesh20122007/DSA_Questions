class Solution {
    public int maxSelectedElements(int[] nums) {

        int result = 0;
        Arrays.sort(nums);
        Map<Integer , Integer> dp = new HashMap<>();

        for(int n : nums){
            dp.put(n + 1 , Math.max(dp.getOrDefault(n + 1 , 0) , dp.getOrDefault(n , 0) + 1));

            dp.put(n , Math.max(dp.getOrDefault(n , 0) , dp.getOrDefault(n - 1 , 0) + 1));

            result = Math.max(result , Math.max(dp.get(n) , dp.get(n + 1)));
        }

        return result;
        
    }
}