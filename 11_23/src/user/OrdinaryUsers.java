package user;

import function.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 18:55
 */
public class OrdinaryUsers extends User{
    public OrdinaryUsers(String name) {
        super(name);

        this.function = new Function[] {//将接口数组初始化为当前需要实现的功能
                new ExitFunction(),
                new FindFunction(),
                new BorrowFunction(),
                new ReturnFunction()
        };

    }

    public int menu() {
        System.out.println("************************");
        System.out.println("hello " + name + " 来到图书馆");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("************************");
        System.out.println("请输入你的操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}

