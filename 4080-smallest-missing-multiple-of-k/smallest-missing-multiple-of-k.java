class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> elements = new HashSet<>();
        for(int n : nums){
                elements.add(n);
        }
        int ans = k;
        while(elements.contains(ans)){
            ans = ans + k;
        }
        return ans;

    }
}