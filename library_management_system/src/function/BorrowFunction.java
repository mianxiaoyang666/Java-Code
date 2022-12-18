package function;


import book.Book;
import book.BookShelf;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 21:39
 */
public class BorrowFunction implements Function {
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("请输入借阅的图书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookShelf.getBookSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookShelf.getBook(i);
            if(book.getName().equals(name)) {
               if (book.isFlag() == false) {
                   book.setFlag(true);
                   System.out.println("借阅成功");
               }else{
                   System.out.println("该书已被借走");
               }
               return;
            }
        }
        System.out.println("未找到该书");
    }
}