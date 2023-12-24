package firsttests;
/**
 * 测试方法的用法
 */
import java.util.Scanner;
public class TestMethod {
    
    public static void main(String[] args) {
        //测试第一个方法
        Scanner userinput = new Scanner(System.in);
        System.out.println("输入单词：");
        String input = userinput.nextLine();
        printIt(input);

        //测试第二个方法
        System.out.println("请依次输入三个数字求平均值：");
        int a = userinput.nextInt();
        int b = userinput.nextInt();
        int c = userinput.nextInt();
        System.out.println(avg3(a, b, c));

        userinput.close();
    }
    /**定义的方法1*/
    public static void printIt(String input) {
        System.out.println(input);
        
    }
    /**定义的方法2 */
    public static double avg3(int a, int b, int c) {
        double avg = (a + b + c)/3;
        return avg;
        
    }
}
