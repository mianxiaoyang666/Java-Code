import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-09
 * Time: 14:01
 */
public class Test {
    public static void main(String[] args) {
        int a;
        System.out.println(a);
    }
    public static void main7(String[] args) {
        //先定义
        WashingMachine washing1 = new WashingMachine();
        washing1.brand = "天鹅";
        washing1.washClothes();
        //后定义
        WashingMachine washing2 = new WashingMachine();
        washing2.washClothes();
        washing2.brand = "美的";
    }
    public static void main6(String[] args) {
        WashingMachine washing = new WashingMachine();
        washing.brand = "天鹅";
        washing.length = 10.55;
        System.out.println(washing.brand);
        System.out.println(washing.length);
        washing.washClothes();
    }
//    class WashingMachine {
//        public String brand; // 品牌
//        public String type; // 型号
//        public double weight; // 重量
//        public double length; // 长
//        public double width; // 宽
//        public double height; // 高
//        public String color; // 颜色
//        public void washClothes() { //洗衣服
//            System.out.println("洗衣服");
//        }
//        public void dryClothes(){ // 脱水
//            System.out.println("脱水功能");
//        }
//       public void setTime(){ // 定时
//            System.out.println("定时功能");
//        }
//    }
    /*调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序.
    如数组：[1,2,3,4,5,6]
    调整后可能是：[1, 5, 3, 4, 2, 6]*/
    public static void main3(String[] args) {
        int[] array = {2,5,7,3,4,6,9};
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            while(left < right && array[left] % 2 != 0) {
                left ++;
            }
            while(left < right && array[right] % 2 == 0) {
                right --;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
    /*实现一个方法 transform, 以数组为参数,
     循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
     例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}*/
    private static void transform(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
    public static void hanoi(int n,char A,char B,char C) {
        if (n == 1) {
            move(n,A,C);
            return;
        }
        hanoi(n - 1,A,C,B);
        move(n,A,C);
        hanoi(n - 1,B,A,C);
    }
    public static void move(int n,char startAddress,char destinationAddress) {
        System.out.println("第" + n + "块盘子从" + startAddress + "移动到" + destinationAddress);
    }
    public static void main1(String[] args) {
        int n = 3;
        hanoi(n,'A','B','C');
    }
}
