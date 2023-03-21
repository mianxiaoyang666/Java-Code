package 力扣132分割回文串II;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-07
 * Time: 10:01
 */
public class Test {
    private static boolean isPalindrome(String s, int begin, int end) {
            int len = s.length();
            while(begin < end) {
                if(s.charAt(begin) == s.charAt(end)) {
                    begin++;
                    end--;
                }else {
                    return false;
                }
            }
            return true;
    }
    public static int minCut(String s) {
        int[] dp = new int[s.length()+1];
        //初始状态：dp(1) = 0
        //转移方程：dp(2) 为回文串时 dp(2) = 0
        //         dp(2) 不为回文串时 dp(2) = min(dp(2),dp(1) + 1)
        //所有状态初始为最大分割次数
        for(int i = 1; i <= s.length(); ++i) {
            dp[i] = i-1;
        }
        for(int i = 2; i <= s.length(); ++i) {
            if(isPalindrome(s, 0, i-1)) {
                dp[i] = 0;
            }else {
                for(int j = 2; j <= i; ++j) {
                    if(isPalindrome(s, j-1, i-1)) {
                        dp[i] = Math.min(dp[i],dp[j-1] + 1);
                    }
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "aab";
        minCut(s);
    }
}
