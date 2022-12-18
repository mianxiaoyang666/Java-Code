package user;

import book.BookList;
import function.Function;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 18:55
 */
public abstract class User {
    protected String name;
    public BookList bookList;
    public User(String name) {
        this.name = name;
    }

    public abstract int menu();//菜单可以不需要实现，只需要子线子类的菜单，改为抽象类重写

    protected Function[] function;//创建一个接口数组

    public void doWork(int choice,BookList bookList) {//此方法去调用当前对象(管理员/用户)下功能的使用
        this.function[choice].work(bookList);
   }
}
