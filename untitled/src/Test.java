import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-12
 * Time: 9:20
 */


class Stundet {
    public String a = "张三";
}
class Test2{
    public static void print1() {
        System.out.println("可以调用");
        //静态成员方法不能使用非静态成员，需要新建对象使用对象引用
        Stundet s1  = new Stundet();
        System.out.println(s1.a);
    }
    public void print2() {
        System.out.println("不可以调用");
    }
}
public class Test {
    public static void main(String[] args) {
        Test2.print1();//无需创建对象就可以通过类名调用
        Test2.print2();//非静态成员方法不可以调用
    }
}
//class Stundet {
//    public String a = "张三";
//}
//public class Test {
//    public void func1(){
//        //静态成员方法内部调用非静态成员方法需要new 一个对象
//    }
//    public static void func2() {
//        //静态成员方法内部调用静态成员方法可以直接调用
//        System.out.println(Student.a);
//        S
//    }
//    public static void main(String[] args) {
//        Test test2 = new Test();
//        test2.func1();
//        func2();
//    }
//}
//class Test2{
//    public static void print1() {
//        System.out.println("可以调用");
//    }
//    public void print2() {
//        System.out.println("不可以调用");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Test2.print1();//无需创建对象就可以通过类名调用
//        Test2.print2();//非静态成员方法不可以调用
//    }
//}
//class Student {
//    public String name;//姓名
//    public int age;//年龄
//    public static String classRoom = "教学楼205";//上课教室
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Student s1 = new Student("张三",17);
//        Student s2 = new Student("李四",18);
//        Student s3 = new Student("王五",16);
//        System.out.println(s1.classRoom);
//        System.out.println(s2.classRoom);
//        System.out.println(s3.classRoom);
//        System.out.println(Student.classRoom);
//    }
//}
//    public static void myqsort(int[] array) {
//        int sz = array.length - 1;//8
//        for (int i = 0; i < sz; i++) {
//            for (int j = 0; j < sz - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = {53, 21, 54, 76, 5, 43, 87, 32, 65};
//        myqsort(array);
//        System.out.println(Arrays.toString(array));
//    }
//}
//public static void main(String[] args) {
//    int[] num = {2,7,11,15};
//    int sz = num.length - 1;
//    Scanner sc = new Scanner(System.in);
//    int target = sc.nextInt();
//    for (int i = 0; i < sz; i++) {
//        for (int j = i; j < sz; j++) {
//            if(num[i] + num[j+ 1] == target) {
//                System.out.println("[" + j + " " + (j+1) + "]");
//            }
//        }
//    }
//}
//    public static void find(int[] array) {
//        //7
//        for (int i = 0; i < array.length - 1; i += 2) {
//            if(array[i] != array[i + 1]) {
//                System.out.println(array[i]);
//            }
//        }
//    }
//public static void main(String[] args) {
//    int[] array = {4,1,4,1,6,5,6};//1 1 2 4 4 5 5 6
//        int sz = array.length - 1;
//        for (int i = 0; i < sz; i++) {
//            for (int j = 0; j < sz - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                }
//            }
//        }
//        find(array);
//}

    //    public static void main(String[] args) {
//        int[] array = {1,2,1,1,1,2,2,2,2};
//        int s = array[0];
//        int flag = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == s){
//                flag ++;
//            }
//            else if (array[i] != s) {
//                flag --;
//            }
//            if(flag == 0) {
//                s  = array[i + 1];
//            }
//        }
//        System.out.println(s);
//    }
//    public static void judeg(int[] a) {
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 != 0) {
//                count++;
//            } else {
//                count = 0;
//            }
//            if (count == 3) {
//                System.out.println("true");
//                return;
//            }
//        }
//        System.out.println("flase");
//    }
//
//    public static void main(String[] args) {
//        int[] a = {1, 2, 34, 3, 4, 5, 7, 23, 12};
//        int[] b = {2,6,4,1};
//        judeg(a);
//        judeg(b);
//    }
//}
