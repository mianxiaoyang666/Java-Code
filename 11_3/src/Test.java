/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-13
 * Time: 9:03
 */
class Student {
    public String name;//姓名
    public int age;//年龄
    public static String classRoom = "教学楼205";//上课教室 静态成员变量

    public Student(String name, int age) {//构造方法
        this.name = name;
        this.age = age;
        System.out.println("我是构造方法，我居然不是最快的");
    }

    {
        System.out.println("我是构造代码块，虽然构造对象的时候构造方法率先出场，、" +
                "但是我比他还快，我是超越光速的代码块！！！");
    }

    public void show() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);

//        {
//            System.out.println("我是普通代码块，我在方法内部使用{}括号定义的代码块，" +
//                    "无需条件就能执行，但是很少有人这么使用我");
//        }

    }
}
//class Student {
//    public String name = "张三";//姓名
//    public int age;//年龄
//    public static String classRoom = "教学楼205";//上课教室
//
//    public Student(String name, int age, String c) {
//        this.name = name;
//        this.age = age;
//        classRoom = c;
//    }
//
//    public static String getClassRoom() {
//        return classRoom;//可以访问静态成员变量
//    }
//
//    public static void setClassRoom(String classRoom) {
//        Student.classRoom = classRoom;//可以初始化或者说修改静态成员变量
//    }
//}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        //s1.show();
    }
//    public static void main1(String[] args) {
//        Student s1 = new Student("张三", 18, "教学楼");
//        System.out.println(s1.getClassRoom());
//    }
}
