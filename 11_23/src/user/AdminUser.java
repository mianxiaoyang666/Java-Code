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
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);

        this.function = new Function[] {
                new ExitFunction(),
                new FindFunction(),
                new AddFunction(),
                new DeleteFunction(),
                new ShowFunction()
        };
    }

    public int menu() {
        System.out.println("************************");
        System.out.println("hello " + name + " 来到图书馆");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("************************");
        System.out.println("请输入你的操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
