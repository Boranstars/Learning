package basicalclass;

public class TestString2 {
    public static void main(String[] args) {
        /**直接拼接string对象 */
        var s1 = "";
        long snum1 = Runtime.getRuntime().freeMemory();
        long stime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s1 += i;
        }
        System.out.println(s1.toString());
        long enum1 = Runtime.getRuntime().freeMemory();
        long etime1 = System.currentTimeMillis();
        

        /**使用stringbuilder */
        /**直接拼接string对象 */
        var s2 = new StringBuilder("");
        long snum2 = Runtime.getRuntime().freeMemory();
        long stime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s2.append(i);
        }
        //System.out.println(s2.toString());
        long enum2 = Runtime.getRuntime().freeMemory();
        long etime2 = System.currentTimeMillis();

        System.out.println("String内存·" + (snum1 - enum1));
        System.out.println("String时间·" + (etime1 - stime1));
        System.out.println("StringBuilder内存·" + (snum2 - enum2));
        System.out.println("StringBUilder时间·" + (etime2 - stime2));
        
    }
    
}
