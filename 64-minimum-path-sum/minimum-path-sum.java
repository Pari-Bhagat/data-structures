class Solution {
    // public int minPath(int i, int j, int[][] grid, int[][] dp) {
    //     if (i == 0 && j == 0) return grid[0][0];
    //     if (i < 0 || j < 0) return (int) 1e9;
    //     if (dp[i][j] != -1) return dp[i][j];
    //     int up = grid[i][j] + minPath(i - 1, j, grid, dp);
    //     int left = grid[i][j] + minPath(i, j - 1, grid, dp);
    //     return dp[i][j] = Math.min(up, left);
    // }

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[] prev = new int[m];
        
        // Loop through each row
        for (int i = 0; i < n; i++) {
            int[] temp = new int[m];
            
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    temp[j] = grid[i][j];
                } else {
                    int up = grid[i][j];
                    if (i > 0)
                        up += prev[j];
                    else
                        up += (int)1e9;
                    
                    int left = grid[i][j];
                    if (j > 0)
                        left += temp[j - 1];
                    else
                        left += (int)1e9;
                    
                    temp[j] = Math.min(up, left);
                }
            }
            prev = temp;
        }
        return prev[m - 1];
    }
}