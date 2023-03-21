package 力扣72编辑距离;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-12
 * Time: 11:13
 */
public class Test {
    public static int minDistance(String word1, String word2) {
        int row = word1.length();
        int col = word2.length();
        int[][] dp = new int[row+1][col+1];
        int i,j;
        for(i = 0; i <=row; ++i) {
            dp[i][0] = i;
        }
        for(i = 1; i <= col; ++i) {
            dp[0][i] = i;
        }
        for(i = 1; i <= row; ++i) {
            for(j = 1; j <= col; ++j) {
                //插入：dp[i][j] = dp[i][j-1] + 1
                //删除：dp[i][j] = dp[i-1][j] + 1
                //替换：if(w1[i] != w2[j])
                //      dp[i][j] = dp[i-1][j-1] + 1
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + 1;
                if(word1.charAt(i-1) != word2.charAt(j-1)) {
                    dp[i][j] = Math.min(dp[i][j],dp[i-1][j-1] + 1);
                }else {
                    dp[i][j] = Math.min(dp[i][j],dp[i-1][j-1]);
                }
            }
        }
        System.out.println(dp[row][col]);
        return dp[row][col];
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        minDistance(word1,word2);
    }
}
