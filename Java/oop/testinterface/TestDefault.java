package oop.testinterface;

public interface TestDefault {
    default void printInfo(){
        System.out.println(TestDefault.this);
    }
    void printHi();

    public static void testStatic0(){
        System.out.println("This is static!");
    }
}

class Implements01 implements TestDefault {

    @Override
    public void printHi() {
        System.out.println("HI");
    }
    
    static void testStatic1(){
        System.out.println("This is my static!");
    }
}
