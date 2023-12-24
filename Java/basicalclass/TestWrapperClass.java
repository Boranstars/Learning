package basicalclass;
/*测试包装类 */
public class TestWrapperClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(101);
        int a = i.intValue();

        Integer j = 100;//自动装箱
        int a1 = j;//自动拆箱

        double b = i.doubleValue();
        double b1 = i;

        System.out.println(a+b);
        System.out.println(a1*b1);
    }
}
