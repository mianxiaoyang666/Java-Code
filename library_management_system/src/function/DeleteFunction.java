package function;


import book.Book;
import book.BookShelf;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 21:32
 */
public class DeleteFunction implements Function{
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("请输入删除的图书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize =bookShelf.getBookSize();
        int index = 0;

        for (int i = 0; i <currentSize ; i++) {
            if(bookShelf.getBook(i).getName().equals(name)) {
                System.out.println("删除成功");
                index = i;
            }
        }
        if (index == 0) {
            System.out.println("未找到");
            return;
        }
        for (int j = index; j < currentSize - 1; j++) {
            Book book = bookShelf.getBook(j + 1);
            bookShelf.setBook(j,book);
        }

        bookShelf.setBookSize(currentSize - 1);
    }
}
