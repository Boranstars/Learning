package firsttests;

import java.util.Scanner;
/**
 * 年薪计算器
 * @author Boran
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~年薪计算器~~~~~~~~~~~~~~");

        while(true) {
            System.out.println("请输入月薪: ");
            int salary = userinput.nextInt();
            if(salary == 88){
                System.out.println("再见！");
                break;
            }else if(salary == 66){
                System.out.println("已切换用户");
                continue;
            }else{
                System.out.println("请输入月份数量：");
                int month = userinput.nextInt();
                System.out.println("薪资为" + month * salary);
            }
        }
        userinput.close();
    }
}
