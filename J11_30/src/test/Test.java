package test;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-30
 * Time: 21:20
 */
class JudgeUserPassWord extends Exception {
    public JudgeUserPassWord(String message) {
        super(message);
    }
}

class JudgeUserName extends Exception {
    public JudgeUserName(String message) {
        super(message);
    }
}

class User {
    protected String userPassWord = "12345aaa";
    protected String userName = "小白";

    public void judgePassWord(String PassWord) throws JudgeUserPassWord{
        if(!PassWord.equals(this.userPassWord)) {
            throw new JudgeUserPassWord("密码错误！");
        }
    }
    public void judgeName(String name) throws JudgeUserName {
        if(!name.equals(this.userName)) {
            throw new JudgeUserName("姓名错误！");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入name：");
        String name = scanner.nextLine();
        System.out.println("请输入passWord：");
        String passWord = scanner.nextLine();
        User user = new User();
        try {
            user.judgePassWord(passWord);
        } catch (JudgeUserPassWord judgeUserPassWord) {
            judgeUserPassWord.printStackTrace();
        }
        try{
            user.judgeName(name);
        } catch (JudgeUserName judgeUserName) {
            judgeUserName.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
