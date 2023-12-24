package firsttests;
/**
 * 计算数字和，偶数和，奇数和
 */
//import java.util.Scanner;
public class ForSumPractice {
    public static void main(String[] args) {
        //Scanner userinputScanner = new Scanner(System.in);
        //String limitinput = userinputScanner.nextLine();
        int limit = 100; 
        int sum = 0, evenSum = 0, oddSum = 0;
        for(int i = 0;i <= limit;i++){
            sum += i;
            if (i%2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(sum);
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
    
}
