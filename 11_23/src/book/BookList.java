package book;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created with IntelliJ IDEA.
 * Description:书架
 * User: 21040
 * Date: 2022-11-23
 * Time: 18:41
 */
public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;//记录当前books数组中有几本书
    public BookList(){
        this.books[0] = new Book("三国演义","罗贯中",89,"小说");
        this.books[1] = new Book("西游记","吴承恩",78,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹",49,"小说");
        this.usedSize = 3;
    }
    public Book getBook(int size) {//获取当前books下标下的book
        return this.books[size];
    }

    public void setBook(Book book) {
        books[usedSize] = book;
    }

    public void setBook(int ret,Book book) {
        books[ret] = book;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
