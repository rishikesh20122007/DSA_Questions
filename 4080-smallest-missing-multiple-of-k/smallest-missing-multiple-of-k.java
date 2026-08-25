class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> elements = new HashSet<>();
        for(int num: nums){
            elements.add(num);
        }
        int result = k;
        while(elements.contains(result)){
            result = result + k;
        }

        return result;
    }
}