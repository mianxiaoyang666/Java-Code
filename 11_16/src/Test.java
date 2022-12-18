import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-16
 * Time: 14:43
 */

class Animal {
    public String name;//姓名
    public int age;//年龄

    public Animal() {
        System.out.println("父类构造方法");
    }
    static {
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类非静态代码块");
    }
}
class Cat extends Animal{
    String colour;//颜色

    public Cat() {
        super();
        System.out.println("子类构造方法");
    }
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类非静态代码块");
    }
}
public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("===================");
        Cat cat2 = new Cat();
    }
}

//class Animal {
//    public String name;//姓名
//    public int age;//年龄
//}
//class Cat extends Animal{
//    String colour;//颜色
//    public void cry() {
//        name = "小猫";//访问从父类继承下来的name
//        age = 4;//访问从子类继承下来的age
//        colour = "金色";//访问子类自己的colour
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.cry();
//    }
//}

//class Animal {
//    public String name = "动物1";
//    public int age = 4;
//    String colour;
//    }
//class Cat extends Animal{
//    String name;
//    int age;
//    public void cry() {
//        name = "小猫";//存在同名优先访问子类的name
//        age = 5;//存在同名优先访问子类自己的age
//        colour = "金色";//子类中没有的变量从父类中访问
//        a = 10;//如果子类和父类中都没有就会报错
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.cry();
//    }
//}

//class Animal {
//    public String name;
//    public int age;
//
//    public void eat() {
//        System.out.println("吃饭");
//    }
//}
//class Cat extends Animal{
//    public void cry() {
//        System.out.println("喵喵");
//    }
//}
//class Dog extends Animal{
//    public void cry() {
//        System.out.println("汪汪叫");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Dog dog1 = new Dog();
//        cat1.name = "小猫";
//        System.out.println(cat1.name);
//        cat1.cry();
//        dog1.name = "小狗";
//        System.out.println(dog1.name);
//        dog1.cry();
//    }
//}
