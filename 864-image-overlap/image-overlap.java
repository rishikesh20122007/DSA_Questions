class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxOverlap = 0;
        // Try every possible row shift
        for (int i = -n + 1; i <= n - 1; i++) {
            // Try every possible column shift
            for (int j = -(n - 1); j <= n - 1; j++) {
                int overlap = 0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        // New position of img1[k][l] after translation
                        int nr = k + i;
                        int nc = l + j;
                        // Checking if translated position is inside matrix
                        if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                            if (img1[k][l] == 1 && img2[nr][nc] == 1) {
                                overlap++;
                            }
                        }
                    }
                }
                maxOverlap = Math.max(maxOverlap, overlap);
            }
        }
        return maxOverlap;
    }
}
