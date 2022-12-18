import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-10-30
 * Time: 11:11
 */
public class test {
    public static void main(String[] args) {
        float a = 1f;
        switch(a){.

        }
    }
    public static void main2(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(100);
        System.out.println(randNum);
    }
    public static void main1(String[] args) {
        int i = 1;
        while(true) {
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i);
            }
           else if(i > 100){
               break;
            }
           i++;
        }
    }
}
