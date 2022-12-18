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
public class AddFunction implements Function{
    @Override
    public void work(BookShelf bookShelf) {
        System.out.println("添加图书");
        int currentSize =bookShelf.getBookSize();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书名：");
        String name = scanner.nextLine();

        System.out.println("请输入图书作者：");
        String author = scanner.nextLine();

        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();

        String sc = scanner.nextLine();//吞空格

        System.out.println("请输入图书类型：");
        String type = scanner.nextLine();

        Book book = new Book(name,author,price,type);
        bookShelf.setBook(book);

        System.out.println("添加完成");

        bookShelf.setBookSize(currentSize + 1);
    }
}

