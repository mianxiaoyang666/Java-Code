package 力扣45跳跃游戏2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-16
 * Time: 11:35
 */
public class Test {
    public static int jump(int[] nums) {
        int len = nums.length;
        if(len == 1) {
            return 0;
        }
        int max = 0;
        int count = 0;
        if(nums[0] >= len-1) {
            return 1;
        }
        while(max < len-1) {
            int max1 = 0;
            int maxLen = 0;
            for(int i = max+1; i <= max + nums[max]; ++i) {
                if(i > len-1) {
                    break;
                }
                if(i + nums[i] >= maxLen) {
                    maxLen = i + nums[i];
                    max1 = i;
                }
            }
            count++;
            max = max1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr  = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        jump(arr);
    }
}
