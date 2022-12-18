package book;

/**
 * Description:书
 */
public class Book {
    private String name;//姓名
    private String author;//作者
    private int price;//价格
    private String type;//类型
    boolean flag;//是否被借出

    //重写 toString 使 println 将当前对象下成员变量打印出来

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                (flag == false? "未借出":"已借出")+//三目操作符，如 果flag 是 false 返回未借出，不是 false 就返回已借出
                '}';
    }

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    //get 和 set 获取和修改当前对象下成员变量
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
