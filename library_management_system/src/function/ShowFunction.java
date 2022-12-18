package function;


import book.Book;
import book.BookShelf;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-23
 * Time: 21:39
 */
public class ShowFunction implements Function{
    @Override
    public void work(BookShelf bookShelf) {
        for (int i = 0; i < bookShelf.bookSize; i++) {
            Book book = bookShelf.getBook(i);
            System.out.println(book);
        }
    }
}
