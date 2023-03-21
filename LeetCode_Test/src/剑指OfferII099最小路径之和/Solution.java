package 剑指OfferII099最小路径之和;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-06
 * Time: 10:16
 */
public class Solution {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = 1;
        int j = 1;
        for(i = 1; i < m; ++i) {
            grid[i][0] += grid[i-1][0];
        }
        for(j = 1; j < n; ++j) {
            grid[0][j] += grid[0][j-1];
        }

        for(i = 1; i < m; ++i) {
            for(j = 1; j < n; ++j) {
                grid[i][j] = Math.min(grid[i][j-1] + grid[i][j],
                        grid[i-1][j] + grid[i][j]);
            }
        }
        return grid[m-1][n-1];
    }
}
class Test {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        Solution.minPathSum(grid);
        for (int[] x: grid) {
            System.out.println(Arrays.toString(x));
        }
    }
}
