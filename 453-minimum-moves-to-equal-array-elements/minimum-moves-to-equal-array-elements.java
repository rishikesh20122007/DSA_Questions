class Solution {
    public int minMoves(int[] nums) {
        int minimum = nums[0];

        for(int n : nums){
            minimum = Math.min(minimum , n);
        }

        int moves = 0;

        for(int n : nums){
            moves =  moves + n - minimum;
        }
        return moves;
    }
}

// class Solution {
//     public int minMoves(int[] nums) {
//         int minimum = nums[0];
//         int moves = 0;

//         for(int n : nums){
//             minimum = Math.min(minimum , n);
//             moves = moves + n - minimum;
//         }

//         return moves;
//     }
// }