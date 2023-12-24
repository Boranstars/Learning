package basicalclass;

import java.util.Date;

/**测试时间类 */
public class TestDate {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println(now);
        var d1 = new Date(114514);
        System.out.println(d1);
        System.out.println(d1.getTime());
    }
}
