/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-30
 * Time: 21:03
 */
//public class TestClass {
//        private static void testMethod(){
//            System.out.println("testMethod");
//        }
//
//        public static void main(String[] args) {
//            try {
//                ((TestClass)null).testMethod();
//            } catch (Exception e) {
//                System.out.println("1");
//            }
//        }
//}

public class TestClass {
    private static void doSomething() throws Exception{
        throw new Exception();
    }
    public static void main(String[] args) {

            try {
                doSomething();
                // do something that may cause an Exception

            } catch (java.io.FileNotFoundException ex) {

                System.out.print("FileNotFoundException!");

            } catch (java.io.IOException ex) {

                System.out.print("IOException!");

            } catch (java.lang.Exception ex) {

                System.out.print("Exception!");

            }

    }
}