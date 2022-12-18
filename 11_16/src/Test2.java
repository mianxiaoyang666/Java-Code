import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-16
 * Time: 21:35
 */
//class Teacher {
//
//}
//class Student {
//    public int a = 10;
//}
//class School {
//    public Teacher teacher;
//    public Student student;
//}
//public class Test2 {
//    public static void main(String[] args) {
//        School school = new School();
//        school.student.a = 1;
////        final int[] array = {1,2,3};
////        array = new int[] {1,2,3,4,5};//报错
////        array[0] = 10;//对象的值可以改变
//
//    }
//}

public class Test2{

    private String name = "Person";

    int age=0;

}

public class Child extends Test2{

    public String grade;

    public static void main(String[] args){

        Test2 p = new Child();

        System.out.println(Test2.name);

    }

}
