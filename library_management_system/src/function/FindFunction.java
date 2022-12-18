package function;

import book.BookShelf;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 21:38
 */
public class FindFunction implements Function{
    @Override
    public void work(BookShelf bookShelf) {
        int currentSize =bookShelf.getBookSize();
        System.out.println("请输入图书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (int i = 0; i < currentSize; i++) {
            if(bookShelf.getBook(i).getName().equals(name)) {
                System.out.println("找到");
                System.out.println(bookShelf.getBook(i));
                return;
            }
        }
        System.out.println("未找到");
    }
}