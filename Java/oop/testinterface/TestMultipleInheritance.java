package oop.testinterface;
/**
 * 测试接口多重继承
 */
public class TestMultipleInheritance {
    public static void main(String[] args) {
        C c = new CImp();
        c.testB();
        c.testA();
        c.testC();
    }
}

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C extends A, B{
    void testC();
    
}

class CImp implements C {

    @Override
    public void testA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testA'");
    }

    @Override
    public void testB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testB'");
    }

    @Override
    public void testC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testC'");
    }
    
}

