package oop.testencapsulation.a;

public class Person {
    int testDefault;// 包内友好
    public int testPublic;
    private int testPrivate; //私有，自己访问
    protected int testProtected;//同包访问，父子访问

    public void test() {
        System.out.println(this.testDefault);
        System.out.println(this.testPrivate);
    }
}
