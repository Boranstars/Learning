package oop.testinnerclass;
/**
 * 测试内部类的用法
 */
public class Outer {
    private static int age = 10;
    public static void main(String[] args) {
        System.out.println(age);
        Inner.main(args);
    }
    public class Inner { 
        static int age = 20;
        public static void main(String[] args) {
            System.out.println(age);
            System.out.println(Outer.age);
        }
    }
}
