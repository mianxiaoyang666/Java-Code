import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-05
 * Time: 15:15
 */
class Person {
    private String name;
    private String gender;
    int age;

    // 想要让该类支持深拷贝，覆写Object类的clone方法即可
    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
public class Test {
    public static void func(String a) throws NullPointerException {
        if (a == null) {
            throw new NullPointerException();
        }
    }
    public static void func2() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static void main(String[] args) {
        System.out.println(0/0);
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

        }catch(NullPointerException e){

        }finally {
            scanner.close();//关闭scanner 这个资源
        }
    }
    public static void main2(String[] args){
        try {
            func(null);//如果这个抛出的异常被捕获到了后续的代码就不会运行
            func2();//不会运行
        } catch (NullPointerException exception) {
            System.out.println("捕获到NullPointerException异常后需要处理的逻辑代码");
        }catch (CloneNotSupportedException exception) {
            System.out.println("捕获到CloneNotSupportedException异常后需要处理的逻辑代码");
        }
        System.out.println("hello");
    }

    public static void main3(String[] args){
        try {
//            func(null);
        } catch (NullPointerException exception) {
            System.out.println("捕获到CloneNotSupportedException异常后需要处理的逻辑代码");
        }
        System.out.println("hello");
    }
}
//        public static void main2(String[] args) throws CloneNotSupportedException {
//            func(null);
//            System.out.println("hello");
//        }
//        public static void main1(String[] args) throws CloneNotSupportedException {
//        Person person = new Person();
//        person.clone();
//        System.out.println("hello");
//        System.out.println(10/0);
//        int[] array = null;
//        int a = array[10];
//        System.out.println("hello");
//    public static void main(String[] args) {
//        System.arraycopy();
////    }
//}
