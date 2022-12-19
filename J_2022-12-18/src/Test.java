/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-19
 * Time: 15:50
 */
class A {
    public void a() {

    }
}

class B extends A{
    public void b() {
        int a = 0;
        a = 1;
    }
}

class C extends B {

}
public class Test {
    public static void main(String[] args) {
        A a = new C();
        a.a();

    }
}
