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
public class AdministratorUser extends User{
    public AdministratorUser(String name) {
        super(name);

        this.function = new Function[] {//初始化接口数组，在里面存放相应的功能
                new ExitFunction(),//退出功能放在0下标位置
                new FindFunction(),
                new AddFunction(),
                new DeleteFunction(),
                new ShowFunction()
        };
    }

    @Override
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
        int functionChoice = scanner.nextInt();
        return functionChoice;
    }
}
