package oop;
/**
 * 测试字符串类，复习知识
 */
public class ReviewOop {
    public static void main(String[] args) {
        //String s0 = null;
        String s1 = "";//空字符串
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        //System.out.println(s0.length());
        //产生空指针异常：NullPointerException
        System.out.println("++测试字符串相等的判断++");
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
    }
    
}
