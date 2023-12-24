package firsttests;
/** 
 */

import java.util.Scanner;

/**
*第一个程序
*@author Boran
*@version 1.0
*<img src = "https://tse3-mm.cn.bing.net/th/id/OIP-C.M73hmssWZrS6rK_Eg79pUQHaJk?w=131&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7">
*  */
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
    }
}
/**
 * 测试变量的运用
 */
class TestVariable{
    public static void main(String[] argStrings){
        int a = 100;
        String b = "asd";
        
        System.out.println(a);
        System.out.println(b);
    }
}
/**
 * 运用具体问题测试最终变量的运用
 */
class CalculatWithCircle{
    public static void main(String[] args){
        final double PI = 3.14;
        // PI = 3;
        double r = 6;
        double area = PI * r * r;
        double circle = 2 * PI * r;
        System.out.println("area = " + area);
        System.out.println("circle = " + circle);
    }

    
}
/**
 * 测试Scanner的运用
 */
class SayWhatUserSaid{
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        String userget = userinput.nextLine();
        System.out.println("SAY " + userget);
        userinput.close();
    }
}
