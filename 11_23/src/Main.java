import book.BookList;
import user.AdminUser;
import user.OrdinaryUsers;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-24
 * Time: 9:02
 */
public class Main {
    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请选择你的身份： 1.管理员          2.普通用户");
        int choice = scanner.nextInt();
        if(choice == 1) {
            return new AdminUser(name);//返回值向上转型
        }else {
            return new OrdinaryUsers(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();//根据返回值来确定这个user指向管理员还是用户
        while(true) {
            int choice = user.menu();//调用完菜单后根据返回值choice来确定你要实现哪个功能
            user.doWork(choice,bookList);
        }
    }
}
