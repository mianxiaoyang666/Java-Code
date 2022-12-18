/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-06
 * Time: 21:57
 */
class NameException extends RuntimeException {
    public NameException(String message) {
        super(message);
    }
}
class PasswordException extends RuntimeException {
    public PasswordException(String message) {
        super(message);
    }
}
public class User {
    String name = "小白";
    String password = "12345";

    public User(String name, String password) {
        if(!this.name.equals(name)) {
            throw new NameException("你的名字错误");
        }
        if(!this.password.equals(password)){
            throw new PasswordException("你的密码错误");
        }
    }
}
class Main {
    public static void main(String[] args) {
        try{
            User user = new User("小白","123");
        }catch (NameException nameException) {
            nameException.printStackTrace();
        }catch(PasswordException passwordException) {
            passwordException.printStackTrace();
        }
    }
}
