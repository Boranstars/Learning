package firsttests;
public class TestCursion {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result = factorial2(60);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Runtime: "+ (startTime - endTime));
        
    }
    public static long factorial1(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial1(n - 1);
        }
    }
    public static long factorial2(long n) {
        long result = n;
        for (long i = 1;i <= n;i++) {
            result *= i;
        }
        return  result;
    }
}
