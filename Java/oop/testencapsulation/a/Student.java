package oop.testencapsulation.a;

public class Student {
    public void study() {
        Person p = new Person();
        System.out.println(p.testProtected);
        System.out.println(p.testDefault);
        System.out.println(p.testPublic);
        //System.out.println(p.testPrivate); //用不了
    }
}
