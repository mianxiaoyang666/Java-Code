package test2;

import test1.ParentClass;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-16
 * Time: 20:54
 */

public class SubClass extends ParentClass {//子类可以访问
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        System.out.println(s1.a);
    }
}
class main {
    public static void main(String[] args) {//非子类不可以访问
        SubClass s2 = new SubClass();
        //System.out.println(s2.a);
    }
}