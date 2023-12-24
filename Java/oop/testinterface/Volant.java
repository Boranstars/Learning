package oop.testinterface;
/**
 * 测试接口
 */
public interface Volant {
    /*public static final*/int FLY_HIGHT = 1000;
    /*public abstract*/   void fly();
}   //前面默认加上，是抽象的

/**
 * Honest
 */
interface Honest {
    void helpOther();
    
}
/**
 * 好人可以帮助他人
 */
class GoodMan implements Honest {

    @Override
    public void helpOther() {
        System.out.println("I'm helping!");
    }
    
}
/**
 * 鸟人会飞
 */
class BirdMan implements Volant {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
    

}

class Angel implements Volant, Honest {

    @Override
    public void helpOther() {
        System.out.println("I'm helping!");
    }

    @Override
    public void fly() {
       System.out.println("I'm flying!");
    }
    
}

