package oop.testinterface;

public class Testthis {
    public static void main(String[] args) {
        Angel a1 = new Angel();
        a1.fly();
        a1.helpOther();
        System.out.println(Angel.FLY_HIGHT);
        

        System.out.println("========================");
        TestDefault t = new Implements01();
        t.printInfo();//默认
        t.printHi();//重写
        System.out.println("========================");
        //t.testStatic0(); //这样实现不了，不能实现接口静态方法
       /*在Java中，接口中的静态方法只能通过接口名称直接访问，
            而不能通过实现类或接口的实例来访问。 */
        //但是子接口可以定义自己的静态方法
        TestDefault.testStatic0();
        Implements01.testStatic1();
        
    }    
        
}
