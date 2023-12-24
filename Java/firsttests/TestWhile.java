package firsttests;
/**
 * 测试While循环
 */
public class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;//初始化部分
        while (i++/*迭代因子 */ < 100 /*布尔表达式 */) {
            //i++是先判断后自增，++i是先自增再判断
            //System.out.println("i:"+i);
            
            j+=i;
            //System.out.println("j:"+j);
        }//循环体
        
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
