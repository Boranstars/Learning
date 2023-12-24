package firsttests;
import java.util.Scanner;
/**
 * 实例：罚款计算器
 */
public class MethodPractice {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int time = userinput.nextInt();
        int monthlysalary = userinput.nextInt();
        System.out.println(calculate(time, monthlysalary));
        userinput.close();
        
    }
    /**计算器 */
    public static int calculate(int time, int monthlysalary) {
        int fine = 0;
        int dailysalary = (int)(monthlysalary/22.5);
        if (time >=1 && time <= 10) {
            System.out.println("警告！");

        } else if (time >10 && time <= 20 ) {
            fine = 100;
            System.out.println("罚款100元");

        } else if (time >20 && time <= 30) {
            fine = 200;
            System.out.println("罚款200元");

        } else if (time >30 && time <= 60) {
            fine =  dailysalary/2;
            System.out.println("罚款半日工资");

        } else if (time > 60){
            fine = 3*dailysalary;
            System.out.println("旷工,罚款3日工资");
        }
        return fine;
    }
}
