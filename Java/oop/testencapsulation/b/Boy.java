package oop.testencapsulation.b;

import oop.testencapsulation.a.Person;

public class Boy extends Person{
    public void test() {
        System.out.println(this.testProtected);//同包可访问
        System.out.println(this.testPublic);
    }
}
