package oop;

public class TestConsruncter {
    public static void main(String[] args) {
        Myclass cls1 = new Myclass("laq", 18, 9);
        Class<?> clazzClass = Myclass.class;
    }
}

/**
 * Myclass
 */
class Myclass {
    
    private String foo;
    int bar;
    int bar2;
    public Myclass(String foo) {
        this.foo = foo;
    }
    public Myclass(String foo, int bar) {
        this(foo);
        this.bar = bar;
    }
    public Myclass(String foo,int bar,int bar2)
    {
        this(foo, bar);
        this.bar2 = bar2;
    }
    @Override
    public String toString() {
        return "Myclass [foo=" + foo + ", bar=" + bar + ", bar2=" + bar2 + "]";
    }
    
    
    

    
}
/**
 * OtherClass
 */
class OtherClass {

    
}