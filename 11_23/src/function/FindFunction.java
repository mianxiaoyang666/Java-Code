package function;

import book.Book;
import book.BookList;

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
    public void work(BookList bookList) {
        int currentSize =bookList.getUsedSize();
        System.out.println("查找图书");
        System.out.println("请输入你需要查找的图书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println("找到了");
                System.out.println(bookList.getBook(i));
                return;
            }
        }
        System.out.println("没找到这本书");
    }

}
