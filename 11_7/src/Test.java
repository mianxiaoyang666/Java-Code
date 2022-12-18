import java.util.Arrays;

/**
* Created with IntelliJ IDEA.
* Description:
* User: 21040
* Date: 2022-11-07
* Time: 15:45
*/public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(ret));
    }
    public static void main9(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,3,4,5,6};
        System.arraycopy(array1,0,array2,0,array1.length);
        System.out.println(Arrays.toString(array2));
    }
    public static void main8(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length*2);
        System.out.println(Arrays.toString(ret));
    }
    public static void main7(String[] args) {
        int[] array= {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array));
    }
    public static int[] func3() {
        int[] array = {1,2,3,4,5};
        return array;
    }
    public static void main6(String[] args) {
        int[] array = func3();
        System.out.println(Arrays.toString(array));
    }
    public static void main5(String[] args) {
        int i = 5;
        int[] arr = new int[i];
    }
    public static void func1(int[] array) {
        array[0] = 100;
    }
    public static void func2(int[] array) {
        array = new int[] {11,22,33,44,55};
    }
    public static void main3(String[] args) {
        int[] array1 = {1,2,3,4,5};
        func1(array1);
        System.out.println("array1 = " + Arrays.toString(array1));
        int[] array2 = {5,6,7,8,9};
        func2(array2);
        System.out.println("array2 = " + Arrays.toString(array2));

    }
    public static void main2(String[] args) {
        int[] array1 = {1,2,3,4};
        array1[0] = 99;
        int[] array2 = array1;
        array2[0] = 100;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
    public static void main1(String[] args) {
        int[] array = null;
        System.out.println(array[0]);
        System.out.println(array.length);
    }
}
