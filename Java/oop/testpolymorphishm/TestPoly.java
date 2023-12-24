package oop.testpolymorphishm;

public class TestPoly {
    public static void main(String[] args) {
        var d1 = new Dog();
        var c1 = new Cat();
        animalCry(c1);
        animalCry(d1);

        Dog d2 = new Dog();
        d2.hangOut();
//      
//      编译类型        运行类型
        Animal d3 = new Dog();//向上转型，是自动的
        d3.cry();
        //d3.hangOut();
        //这不行，因为编译类型是Animal
        Dog d4 = (Dog) d3 ;//强制转型
        d4.hangOut();
        //Cat c2 = (Cat) d3;
        //c2.sleep();
        //强制转型，编译时没有问题，但是运行报错
        /*
         * Exception in thread "main" java.lang.ClassCastException: class oop.testpolymorphishm.Dog cannot be cast to class oop.testpolymorphishm.Cat (oop.testpolymorphishm.Dog and oop.testpolymorphishm.Cat are in unnamed module of loader 'app')
        at oop.testpolymorphishm.TestPoly.main(TestPoly.java:20)
         */

         if(d3 instanceof Cat){
            Cat c2 = (Cat) d3;
            c2.sleep();
         }//就不会报错
    }

    static void animalCry(Animal animal){
        animal.cry();  //实现多态
    }
}
