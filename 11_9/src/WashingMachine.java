/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-09
 * Time: 19:44
 */
public class WashingMachine {
        public String brand; // 品牌
        public String type; // 型号
        public double weight; // 重量
        public double length; // 长
        public double width; // 宽
        public double height; // 高
        public String color; // 颜色
        public void washClothes() { //洗衣服
            System.out.println("使用" + brand + "洗衣服");
        }
        public void dryClothes(){ // 脱水
            System.out.println("脱水功能");
        }
       public void setTime(){ // 定时
            System.out.println("定时功能");
        }
}
