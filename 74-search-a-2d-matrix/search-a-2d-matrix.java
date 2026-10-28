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