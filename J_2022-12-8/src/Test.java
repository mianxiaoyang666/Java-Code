import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-08
 * Time: 8:46
 */
class A{

}
class P extends A{

}
class C{
    private String a = "1";
}
public class Test {

    public static void main10(String[] args) {
        C c = new C();

    }
    public static void func(){
        func();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
    }
    public static void main11(String[] args) {
//        URL url = new URL(null);
    }
    public static void main8(String[] args) {
        C c = new C();
//        c.clone();
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        int b = scanner.nextInt();
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3};
        array[4] = 0;
    }
    public static void main5(String[] args) {
        int a = 10/0;
    }
    public static void main4(String[] args) {
        //Class.forName("java.lang.acc");
    }
    public static void main3(String[] args) {
        int[] array = null;
        array[10] = 5;
    }
    public static void main2(String[] args) {
        func();
    }
    public static void main1(String[] args) {
        P p = (P)new A();
    }
}
