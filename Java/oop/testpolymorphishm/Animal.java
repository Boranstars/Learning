package oop.testpolymorphishm;

public class Animal {
    public void cry() {
        
    }
}
class Cat extends Animal {
    public void cry() {
        System.out.println("nya~~");
    }
    public void sleep() {
        System.out.println("sleeping...");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("汪汪~~");
    }
    public void hangOut(){
        System.out.println("出去玩了");
    }
}