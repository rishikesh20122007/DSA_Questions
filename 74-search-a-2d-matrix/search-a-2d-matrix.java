class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow * totalCol;
        int st = 0;
        int ed = n - 1;

        while(st <= ed){
            int mid = st + (ed - st) / 2;
            int rowIndex = mid / totalCol;
            int colIndex = mid % totalCol;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            else if(matrix[rowIndex][colIndex] > target){
                ed = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;
    }
}

// 2nd approach without binary search;

// but it will take time complexity on O(n + m)
//which is probhited according to questions.


// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int totalRow = matrix.length;
//         int totalCol = matrix[0].length;

//         int row = 0, col = totalCol - 1;

//        while(row < totalRow && col >= 0){
//             if(matrix[row][col] == target){
//                 return true;
//             }
//             else if(matrix[row][col] > target){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//        }
//         return false;
//     }
// }