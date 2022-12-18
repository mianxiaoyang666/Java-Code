import book.Book;
import book.BookShelf;
import user.AdministratorUser;
import user.OrdinaryUsers;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-25
 * Time: 20:34
 */
public class Main {
    public static User menu(){
        System.out.println("欢迎来到图书管理系统，请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请选择你的身份：1.管理员      2.普通用户");
        int userChoice = scanner.nextInt();
        if(userChoice == 1) {
            return new AdministratorUser(name);//这里发生向上转型
        }else{
            return new OrdinaryUsers(name);
        }
    }
    public static void main(String[] args) {
        User user = menu();//向上转型后，这个user 根据 menu() 方法的返回值来指向哪个对象(管理员/普通用户)
        BookShelf bookShelf = new BookShelf();//将书架实例化

        while(true){
            int functionChoice = user.menu();//接下里调用当前对象的菜单，创建一个变量来接收返回值来确定实现当前对象的哪个功能。
            user.doWork(functionChoice,bookShelf);//根据上方 menu() 的返回值，传给 doWork() 来确定实现的功能是哪一个
        }

    }
}
