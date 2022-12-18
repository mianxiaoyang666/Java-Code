package function;

import book.Book;
import book.BookList;

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
    public void work(BookList bookList) {
        int currentSize = bookList.getUsedSize();
        System.out.println("删除图书");
        System.out.println("请输入图书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if(index == 0) {
            System.out.println("没有找到该本书");
            return;
        }
        for (int j = index; j < currentSize - 1; j++) {
            Book book = bookList.getBook(j + 1);
            bookList.setBook(j,book);
        }
        bookList.setBook(currentSize - 1,null);
        bookList.setUsedSize(currentSize - 1);
        System.out.println("删除成功");
    }
}
