package test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-05
 * Time: 16:19
 */
//public class Animal {
//    String name;
//
//    Animal(String name){
//        this.name = name;
//    }
//    void eat() {
//    }
//}
//class Dog extends Animal{
//    Dog(String name){
//        super(name);
//    }
//    void eat() {
//        System.out.println(name + "吃饭");
//    }
//}
//class Cat extends Animal{
//    Cat(String name){
//        super(name);
//    }
//    void eat() {
//        System.out.println(name + "吃饭");
//    }
//}

//class Cat extends Animal{
//    Cat(String name){
//        super(name);
//    }
//    void eat() {
//        System.out.println(name + "吃饭");
//    }
//}

public class Animal{
    String name;
    Animal(String name){
        this.name = name;
        cry();
    }
    void cry(){
        System.out.println("动物的叫声");
    }
}

class Dog extends Animal{
    int num = 1;
    Dog(String name){
        super(name);
    }
    void cry() {
        System.out.println(name + "汪汪汪" + num);
    }
}
class Test {
    public static void main(String[] args) {
        Animal animal = new Dog("狗");
    }
}
//        if(animal instanceof Cat) {
//            Cat cat = (Cat)animal1;
//        }
//    }
//    public static void eat(Animal animal) {
//        animal.eat();
//    }
//    public static Animal eat() {
//        Dog dog = new Dog("狗");
//        return dog;
//    }
//
//    public static void main(String[] args) {
//        Animal animal = eat();
//        animal.eat();
////    }
//    public static void main1(String[] args) {
//        Animal animal1 = new Dog("狗");
//        Animal animal2 = new Cat("猫");
//        animal1.eat();
////        animal2.eat();
//    }
//}
