import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-11
 * Time: 13:05
 */
public class Date {
    private int year;
    public int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//   public void setYear(int year) {
//            this.year = year;
//        }
        public void showDate() {
            System.out.println("年：" + year + "月：" + month + "日：" + day);
        }
    }
class Test {
    public static void main(String[] args) {
        Date d1 = new Date(2022,11,11);
        int a = d1.getYear();
        d1.setYear(2020);
        d1.showDate();
        System.out.println(a);
    }
}
//public static void main(String[] args) {
//         Date date = new Date();
//        // 得到一个毫秒级别的时间戳
//        System.out.println(date.getTime());
//        int[] array = {1,2,3};
//        String ret = Arrays.toString(array);
//    }
//}
/*class Test2 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.year);
        System.out.println(d1.month);
        System.out.println(d1.day);
    }
}*/
/*public class Date {
    public int year;
    public int month;
    public int day;

    public Date() {
        // System.out.println("调用了无参数的构造方法");
        this(2022,11,11);
        System.out.println("无参数构造方法先被调用");
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用了参数为:int int int的构造方法");
        this.printDate();
    }
    public void show() {

    }
    public void printDate() {
        this.show();
        System.out.println("年：" + year + "月：" + month + "日：" + +day);
    }

    public static void main(String[] args) {
        Date d1 = new Date();
    }
}*/
/*public class Date {
    public int year;
    public int month;
    public int day;

    public Date() {
       // System.out.println("调用了无参数的构造方法");
        this(2022,11,11);
        System.out.println("无参数构造方法先被调用");
    }
    public Date(int year, int month, int day) {
        this();
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用了参数为:int int int的构造方法");
    }
    public void printDate() {
        System.out.println("年：" + year + "月：" + month + "日：" + +day);
    }

    public static void main(String[] args) {
        Date d1 = new Date();
    }
}*/
//public class Date {
//    public int year;
//    public int month;
//    public int day;
//
//    public Date() {
//        System.out.println("调用了无参数的构造方法");
//    }
//    public Date(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//        System.out.println("调用了参数为:int int int的构造方法");
//    }
//    public void printDate() {
//        System.out.println("年：" + year + "月：" + month + "日：" + +day);
//    }
//
//    public static void main(String[] args) {
//        Date d1 = new Date();
//
//        Date d2 = new Date(2022,11,11);
//    }
//}

//public class Date {
//    public int year;
//    public int month;
//    public int day;
//
//    public void setDate(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public void printDate() {
//        System.out.println("年：" + year + "月：" + month + "日：" + +day);
//    }
//
//    public static void main(String[] args) {
//        Date d1 = new Date();
//        d1.printDate();
//        d1.setDate(2022,11,11);
//        d1.printDate();
//    }
//    public static void main2(String[] args) {
//        Date d1 = new Date();
//        Date d2 = new Date();
//        Date d3 = new Date();
//
//        d1.setDate(2021,9,11);
//        d2.setDate(2022,10,12);
//        d3.setDate(2023,11,15);
//
//        d1.printDate();
//        d2.printDate();
//        d3.printDate();
//    }
//}
