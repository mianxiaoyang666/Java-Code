import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-04
 * Time: 16:25
 */
public class Test {
    public static int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            res ^= i;
            res ^= nums[i];
        }
        res ^= nums.length;

        return res;
    }
//    public static void rotate(int[] nums, int k) {
//        int size = nums.length;
//        int ret = 0;
//        if(k < 0) {
//            return;
//        }
//        for(int i = 0; i < k; i++) {
//            ret = nums[size-1];
//            for(int j = size-1; j > 0; j--) {
//                nums[j] = nums[j-1];
//            }
//            nums[0] = ret;
//        }
//    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //missingNumber(array);
        rotate(array,3);
        System.out.println(Arrays.toString(array));
    }
}
