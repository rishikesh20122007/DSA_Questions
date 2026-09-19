class Solution {
    public int heightChecker(int[] heights) {
        int n  = heights.length;
        int expected[] = heights.clone();
        Arrays.sort(expected);     // Use Arrays.sort() for sorting

        int count = 0;

        for(int i = 0;i < n;i++){
            if(heights[i] != expected[i]){
                count++;
            }
            
        }
        return count;
    }
}