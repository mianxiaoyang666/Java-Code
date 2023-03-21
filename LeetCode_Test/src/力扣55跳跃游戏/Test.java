package 力扣55跳跃游戏;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-16
 * Time: 8:48
 */
public class Test {
    public static boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(i <= max) {
                max = Math.max(max, i + nums[i]);
                if(max >= nums.length - 1) {
                    return true;
                }
            }else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,1,4};
        canJump(array);
    }
}
