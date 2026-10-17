class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int dsum[] = new int[n];
        for(int i = 0 ; i < n; i++){
            int x = nums[i],
                 sum = 0;
            while(x > 0){
                sum += x % 10;
                x /= 10;
            }
            dsum[i] = sum;
        }

        Integer[] index = new Integer[n];
        for(int i = 0; i < n; i++){
            index[i] = i;
        }

        Arrays.sort(index , (a  , b) ->{
            if(dsum[a] != dsum[b]){
                return Integer.compare(dsum[a], dsum[b]);
            }
            return Integer.compare(nums[a] , nums[b]);
        });

        int target[] = new int[n];
        int rotation = 0;
        for(int pos = 0; pos < n; pos++){
           target[index[pos]] = pos;
        }

        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
             if(!visited[i]){
                rotation++;
                int j = i;
                while(!visited[j]) {
                    visited[j] = true;
                    j = target[j];
                }
            }
        }

        return n - rotation;
    }
}