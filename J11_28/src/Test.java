/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-28
 * Time: 10:01
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcd";
        System.out.println(str1 == str2);
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

//        str1.replace()
        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.append(str2);
        System.out.println(stringBuffer);
        SystemUtil systemUtil = new SystemUtil();
        System.out.println(isAdmin("Admin"));
    }
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
}

class SystemUtil{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}