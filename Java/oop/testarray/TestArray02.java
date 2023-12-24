package oop.testarray;
/**
 * 测试数组的初始化方式
 */
public class TestArray02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3};
        Person[] persons = {new Person(0, 0),
                            new Person(1, 0)};
        //动态初始化（同01）
        //默认初始化
        int[] b = new int[2];
        System.out.println(b);
        System.out.println(a);
        System.out.println(persons);
    }
}
