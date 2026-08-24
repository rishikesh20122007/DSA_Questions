class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //int[][] ans = new int[n][n];   // brute force apprach 

        // for(int i = 0; i < n ; i++){
        //     for(int j = 0; j < n; j++){
        //         ans[j][n-i-1] = matrix[i][j];
        //     }
        // }

        // for (int i = 0; i < n; i++) {    // store result back to the  matrix
        //     for (int j = 0; j < n; j++) {
        //         matrix[i][j] = ans[i][j];
        //     }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}