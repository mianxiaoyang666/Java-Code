package function;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 21:39
 */
public class ReturnFunction implements Function{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入图书名");
        int currentSize = bookList.getUsedSize();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                if(book.isBorrowed() == false) {
                    System.out.println("该图书未被借出，无法归还");
                    return;
                }
                book.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("未找到");
    }
}
