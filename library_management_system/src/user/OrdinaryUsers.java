package user;

import function.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-25
 * Time: 20:30
 */
public class OrdinaryUsers extends User{
    public OrdinaryUsers(String name) {//子类构造方法帮助父类构造方法初始化姓名
        super(name);

        this.function = new Function[] {
                new ExitFunction(),
                new FindFunction(),
                new BorrowFunction(),
                new ReturnFunction()
        };
    }

    @Override
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
        int functionChoice = scanner.nextInt();
        return functionChoice;
    }
}
