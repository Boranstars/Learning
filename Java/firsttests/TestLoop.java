package firsttests;
public class TestLoop {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 5;j++ ){
                System.out.print(i+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
/**
 * InnerTestLoop
 * 生成乘法表
 */
class InnerTestLoop {
    public static void main(String[] args) {
        for(int i =1;i <= 9;i++){
            for(int j =1;j <= i;j++){
                System.out.print(i+" x "+j+" = "+i*j+"\t");

            }
            System.out.println("\n");
        }
    }

    
}
/**
 * 生成图案
 */
class InnerTestLoop2 {
    public static void main(String[] args) {
        for(int i =1;i <= 9;i++){
            for(int j =1;j <= 9;j++){
                char output = (i + j ) % 2 == 0 ? '*' : '#';
                System.out.print(output+"\t");

            }
            System.out.println("\n");
        }
    }

    
}
/**
 * 生成素数
 */
class IterPrimeNumber{
    public static void main(String[] args) {
        outer:for(int i =1; i < 200; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    continue outer; //跳到外部循环
                }
            }
            System.out.print(i + " ");
        }
    }
}