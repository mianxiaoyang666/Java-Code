/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-10
 * Time: 21:03
 */
public class Date {
    public int year;//年
    public int month;//月
    public int day;//日

    public void setDay(Date this,int year, int month, int day) {//设置日期
        year = year;
        month = month;
        day = day;
    }

    public void printDay(Date this) {//打印日期
        System.out.println("年："+ this.year + "月："+ this.month + "日："+ this.day);
    }

    public static void main(String[] args) {
        //创建三个对象
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        //设置日期
        d1.setDay(2022,5,11);
        d2.setDay(2023,6,12);
        d3.setDay(2024,7,12);
        //打印日期
        d1.printDay();
        d2.printDay();
        d3.printDay();
    }
}
