package firsttests;
//import java.lang.Math;

/**
 * 测试if语句
 */
public class TestIf {
    public static void main(String[] args) {
        int d1 = (int)(Math.random() * 6 + 1);
        int d2 = (int)(Math.random() * 6 + 1);
        int d3 = (int)(Math.random() * 6 + 1);
        int sum = d1 + d2 + d3;
        if (sum > 15) {
            System.out.println("YES!");
        } else if (sum >= 10 && sum < 15){
            System.out.println("OPos!");
        } else {
            System.out.println("NO!");
        }
        System.out.println(sum);
    }
    
    
}
