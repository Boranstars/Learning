package oop.testabstarctclass;
/**
 * 测试抽象类
 */
public abstract class Person {
    public void eat(){
        System.out.println("Eating!");
    }
    public abstract void walk();
    
}

class Students extends Person{

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }
    
}