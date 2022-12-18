package book;

/**
 * Description:书架
 */
public class BookShelf {
    private final int num = 10;//书架课存放书本的数量
    public int bookSize = 0;//记录当前书架有几本书
    private Book[] books = new Book[num];//创建Book 类型数组来存放 book

    public BookShelf(){//创建构造方法来初始化我们的书架，在书架中放三本书
        this.books[0] = new Book("红楼梦","曹雪芹",88,"小说");
        this.books[1] = new Book("西游记","吴承恩",78,"小说");
        this.books[2] = new Book("三国演义","罗贯中",65,"小说");
        this.bookSize = 3;//放置完三本书后将 bookSize 修改为3来记录当前书本数量
    }

    public void setBook(Book book) {//将新增的书本放入书架中
        books[bookSize] = book;
    }

    public void setBook(int bookSize,Book book) {
        books[bookSize] = book;
    }

    public Book getBook(int size) {//获取当前books下标下的book
        return this.books[size];
    }

    public int getBookSize() {
        return bookSize;
    }

    public void setBookSize(int bookSize) {
        this.bookSize = bookSize;
    }
}