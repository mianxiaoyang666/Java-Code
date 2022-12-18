/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-15
 * Time: 19:15
 */
//class Student {
//    public String name;//姓名
//    public int age;//年龄
//    public static String classRoom = "教学楼205";//上课教室 静态成员变量
//
//    public Student(String name, int age) {//构造方法
//        this.name = name;
//        this.age = age;
//        System.out.println("我是构造方法，我居然不是最快的");
//    }
//
//    {
//        System.out.println("我是构造代码块，虽然构造对象的时候构造方法率先出场，、" +
//                "但是我比他还快，我是超越光速的代码块！！！");
//    }
//
//    static{
//        System.out.println("我是静态代码块");
//    }
//}
//class Student {
//    public String name;//姓名
//    public int age;//年龄
//    public static String classRoom = "教学楼205";//上课教室 静态成员变量
//
//    public static  void func(){
//
//    }
//    static{
//        System.out.println("我是静态代码块");
//    }
//}

class Student {
    public String name = "张三";
    public int age = 18;
    public String classRoom = "教学楼205";

    public void  show() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.classRoom);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
    }
}
