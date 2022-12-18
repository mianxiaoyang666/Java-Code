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
public class AddFunction implements Function{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        int currentSize =bookList.getUsedSize();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书名：");
        String name = scanner.nextLine();

        System.out.println("请输入图书作者：");
        String author = scanner.nextLine();

        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();

        System.out.println("请输入图书类型：");
        String type = scanner.nextLine();

        Book book = new Book(name,author,price,type);
        bookList.setBook(book);
        bookList.setUsedSize(currentSize + 1);
    }
}
