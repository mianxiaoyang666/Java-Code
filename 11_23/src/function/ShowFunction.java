package function;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 *
 * Time: 21:39
 */
public class ShowFunction implements Function{
    @Override
    public void work(BookList bookList) {
     int currentSize = bookList.getUsedSize();//当前书架有几本书
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);//Book类下重写了toString方法，可以直接打印book
        }
    }
}
