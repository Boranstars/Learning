package firsttests;

public class TestFuncDef {
    public static void main(String[] args) {
        System.out.println(getNumbers(12345678)[0]);
    }
    public static long[] getNumbers(long n) {
        long num[] = new long[8];
        int i = 0;
        for(i=7; i >= 0; i--)
        {
            num[i] = n % 10;
            n /= 10;
        }
        return num;
        
        
    }
}
