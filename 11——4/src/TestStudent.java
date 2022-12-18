import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-04
 * Time: 19:58
 */
public class TestStudent {
    public static void main(String[] args) {
        int[] array = {1,32,5,423,65,234,54,65,43};
        Arrays.sort(array);
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int x:array) {
            System.out.print(x);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array.length);
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[6]);
    }
    public static void main3(String[] args) {
        int[] array1 = new int[5];
        boolean[] array2 = new boolean[5];
    }
    public static void main2(String[] args) {
//        int[] array1 = {1,2,3,4,5};//完全初始化
//        int[] array2 = new int[]{1,2,3,4,5};//完全初始化
//        //上面俩种方式是一样的，第一种更加简洁，我们一般使用第一种较多
//        int[] array3 = new int[5];//不完全初始化
        int[] array = new int[5];
    }
    public static void main1(String[] args) {
        int stu1 = 90;
        int stu2 = 70;
        int stu3 = 91;
        int stu4 = 99;
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
    }
}
