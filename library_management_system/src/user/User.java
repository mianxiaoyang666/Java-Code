package user;

import book.Book;
import book.BookShelf;
import function.Function;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-25
 * Time: 20:29
 */
public abstract class User {
    String name;

    public User(String name) {//父类构造方法初始化姓名
        this.name = name;
    }

    public abstract int menu();

    protected Function[] function;//创建接口数组，里面存放对图书操作的功能

    public void doWork(int functionChoice, BookShelf bookShelf) {
        this.function[functionChoice].work(bookShelf);//choice 选择当前对象下接口数组哪个下标的功能
    }
}
